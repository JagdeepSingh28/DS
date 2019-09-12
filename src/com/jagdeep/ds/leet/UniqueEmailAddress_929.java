package com.jagdeep.ds.leet;

import java.util.HashSet;

public class UniqueEmailAddress_929 {

    public static void main(String[] args) {
        String[] email = new String[]{"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@leetcode.com"};

        String[] emails = new String[]{
                "fg.r.u.uzj+o.pw@kziczvh.com",
                "r.cyo.g+d.h+b.ja@tgsg.z.com",
                "fg.r.u.uzj+o.f.d@kziczvh.com",
                "r.cyo.g+ng.r.iq@tgsg.z.com",
                "fg.r.u.uzj+lp.k@kziczvh.com",
                "r.cyo.g+n.h.e+n.g@tgsg.z.com",
                "fg.r.u.uzj+k+p.j@kziczvh.com",
                "fg.r.u.uzj+w.y+b@kziczvh.com",
                "r.cyo.g+x+d.c+f.t@tgsg.z.com",
                "r.cyo.g+x+t.y.l.i@tgsg.z.com",
                "r.cyo.g+brxxi@tgsg.z.com",
                "r.cyo.g+z+dr.k.u@tgsg.z.com",
                "r.cyo.g+d+l.c.n+g@tgsg.z.com",
                "fg.r.u.uzj+vq.o@kziczvh.com",
                "fg.r.u.uzj+uzq@kziczvh.com",
                "fg.r.u.uzj+mvz@kziczvh.com",
                "fg.r.u.uzj+taj@kziczvh.com",
                "fg.r.u.uzj+fek@kziczvh.com"
        };

        UniqueEmailAddress_929 uniqueEmailAddress_929 = new UniqueEmailAddress_929();
        System.out.println(uniqueEmailAddress_929.numUniqueEmails(emails));
    }

    public int numUniqueEmails(String[] emails) {
        int validEmailIds = 0;
        HashSet<String> uniqueHashSet = new HashSet<>();
        for(int i=0; i<emails.length; i++){
            if(isValidEmail(emails[i], uniqueHashSet))
                validEmailIds++;
        }
        return validEmailIds;
    }

    private boolean isValidEmail(String email, HashSet<String> uniqueHashSet) {
        String[] emailAndDomain = email.split("@");

//        if(!isValidDomain(emailAndDomain[1]))
//            return false;

        String cleanEmail = getCleanEmail(emailAndDomain[0]) + "@" + emailAndDomain[1];
        if(!uniqueHashSet.contains(cleanEmail)){
            uniqueHashSet.add(cleanEmail);
            return true;
        }
        return false;
    }

    private String getCleanEmail(String emailName) {
        emailName = emailName.replace(".","");
        return emailName.split("\\+")[0];
    }

    private boolean isValidDomain(String s) {
        String[] domain = s.split(".com");
        if(domain[0].contains("+") || domain[0].contains("."))
            return false;

        return true;
    }
}

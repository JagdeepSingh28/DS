package com.jagdeep.ds.leet;

public class _28_Haystack_strstr {
    public static void main(String[] args) {
        _28_Haystack_strstr haystack = new _28_Haystack_strstr();
//        System.out.println(haystack.strStr("mississippi", "issip"));  // output : 2
        System.out.println(haystack.strStr("ababcabcabababd", "ababd"));  // output : 2
    }

    public int strStr_(String haystack, String needle) {
        int index = -1;
        if(needle.length()>haystack.length() && needle.length()!=0)
            return index;
        if((needle.length()==0 && haystack.length()==0)||needle.length()==0)
            return 0;
        boolean resultFound = false;
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i) == needle.charAt(j)){
                    if(index == -1)
                        index = i;

                    if(index != -1 && j==needle.length()-1)
                        resultFound = true;

                    if(i<haystack.length()-1)
                    i++;
                }else{
                    break;
                }
            }
        }

        if(resultFound)
            return index;
        else
            return -1;
    }

    public int strStr(String haystack, String needle){
        if (haystack == null || needle == null)
            return -1;
        //generate next array, need O(n) time
        int i = -1, j = 0, m = haystack.length(), n = needle.length();
        int[] next = new int[n];
        if (next.length > 0)
            next[0] = -1;
        while (j < n - 1) {
            if (i == -1 || needle.charAt(i) == needle.charAt(j))
                next[++j] = ++i;
            else
                i = next[i];
        }
        //check through the haystack using next, need O(m) time
        i = 0; j = 0;
        while (i < m && j < n) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            else
                j = next[j];
        }
        if (j == n)
            return i - j;
        return -1;
    }

}

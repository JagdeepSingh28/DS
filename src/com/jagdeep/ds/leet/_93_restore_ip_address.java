package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;

public class _93_restore_ip_address {

    public static void main(String[] args) {
        _93_restore_ip_address restore_ip_address = new _93_restore_ip_address();
        restore_ip_address.restoreIpAddresses("101023");
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        doRestore(result, "", s, 0);
        return result;
    }

    private void doRestore(List<String> result, String path, String s, int k) {
        if (s.isEmpty() || k == 4) {
            if (s.isEmpty() && k == 4)
                result.add(path.substring(1));
            return;
        }
        for (int i = 1; i <= (s.charAt(0) == '0' ? 1 : 3) && i <= s.length(); i++) { // Avoid leading 0
            String part = s.substring(0, i);
            if (Integer.valueOf(part) <= 255)
                doRestore(result, path + "." + part, s.substring(i), k + 1);
        }
    }
}

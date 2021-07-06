package org.eds.epi.strings;

public class InterconvertStringsAndIntegers {

    public String intToString(int x) {
        String ans = "";
        boolean negative = x < 0;

        if (x < 0) {
            negative = true;
            x = -x;
        }

        if (x == 0) {
            ans = "0";
        }

        while (x != 0) {
            int val = x % 10;
            x /= 10;
            ans = Integer.toString(val) + ans;
        }

        return negative ? "-" + ans : ans;
    }

    public int stringToInt(String s) {
        if (s == null || s.isEmpty() || s.trim().length() == 0) {
            throw new RuntimeException(s + " is not an integer 1.");
        }
        s = s.trim();

        boolean negative = false;
        int ans = 0;
        int radix = 10;

        char firstChar = s.charAt(0);

        int i = 0;

        //TODO: Test for integer overflow
        if (firstChar < '0') {
            if (firstChar == '-') {
                negative = true;
            } else {
                if (firstChar != '+') {
                    throw new RuntimeException(s + " is not an integer 2.");
                }
            }
            if (s.length() == 1) {
                throw new RuntimeException(s + " is not an integer 3.");
            }
            i++;
        }

        while (i < s.length()) {
            char value = s.charAt(i);

            if (value < '0') {
                throw new RuntimeException(s + " is not an integer 4.");
            }

            ans *= radix;
            ans -= Character.digit(value, radix);
            i++;
        }


        return negative ? ans : -ans;
    }

    public InterconvertStringsAndIntegers() {

    }
}

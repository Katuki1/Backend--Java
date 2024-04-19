package org.example;

public class Solution2 {
    public static boolean solution(String S) {
        boolean hasB = false;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'a') {
                if (hasB) {
                    return false;
                }
            } else if (c == 'b') {
                hasB = true;
            }
        }
        return true;
    }

}

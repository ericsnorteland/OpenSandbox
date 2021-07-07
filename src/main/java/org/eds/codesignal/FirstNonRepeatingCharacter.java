package org.eds.codesignal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatingCharacter {
    char firstNotRepeatingCharacter(String s) {
        char ans = '_';
        if (s.length() == 1) {
            return s.charAt(0);
        }
        List<Character> values = new ArrayList<>();
        Set<Character> repeaters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (values.contains(s.charAt(i))) {
                values.remove(Character.valueOf(s.charAt(i)));
                repeaters.add(s.charAt(i));
            } else if (repeaters.contains(s.charAt(i))) {
                repeaters.add(s.charAt(i));
            } else {
                values.add(s.charAt(i));
            }
        }
        if (!values.isEmpty()) {
            ans = values.get(0);
        }
        return ans;
    }

    public static void main(String[] args) {
        FirstNonRepeatingCharacter f = new FirstNonRepeatingCharacter();
        System.out.println(f.firstNotRepeatingCharacter("abacabad"));
    }
}

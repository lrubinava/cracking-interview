package ArraysAndStrings;

// given two strings, decide if one is a permutation of another

// are strings case-sensitive?
// do white spaces count?

import java.util.HashSet;

public class CheckPermutation {

    // method 1: hash set
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashSet<Character> chars = new HashSet<Character>();

        // add first word to a hash set
        for (int i = 0; i < s1.length(); i++) {
            chars.add(s1.charAt(i));
        }

        // remove second word characters from hash set
        for (int i = 0; i < s2.length(); i++) {
            if (chars.contains(s2.charAt(i))) {
                chars.remove(s2.charAt(i));
            }
        }

        if (chars.isEmpty()) {
            return true;
        }

        return false;
    }

    // method 2: sort and compare

}

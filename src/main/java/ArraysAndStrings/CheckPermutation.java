package ArraysAndStrings;

// given two strings, decide if one is a permutation of another
// 1) use .sort() and .equals()
// 2) use hash set
// 3) use array like a hash set to map character occurrences

// are strings case-sensitive?
// do white spaces count?

import java.util.HashSet;

public class CheckPermutation {

    // method 1: hash set
    public static boolean isPermutation1(String s1, String s2) {
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

    // method 2: using array
    public static boolean isPermutation2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] chars = new int[128];

        // map characters of the first string by incrementing their indexes in array
        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i)]++;
        }

        // decrement indexes of s2 characters. If any of them becomes -1, return false
        for (int i = 0; i < s2.length(); i++) {
            chars[s2.charAt(i)]--;
            if (chars[s2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

}

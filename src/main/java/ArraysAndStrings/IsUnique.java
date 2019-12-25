package ArraysAndStrings;

// determine if a string has all unique characters
// what if no data structures are used?
// is ASCII or Unicode used? 128 or 256?

import java.util.HashSet;

public class IsUnique {

    // using HashSet
    public static boolean isUnique1(String input) {
        HashSet<Character> letters = new HashSet<Character>();

        for (int i = 0; i < input.length(); i++) {
            if(letters.contains(input.charAt(i))) {
                return false;
            }
            letters.add(input.charAt(i));
        }
        return true;
    }

    // test using HashSet
    public static void testIsUnique1(String[] inputCases) {
        for (String s : inputCases) {
            System.out.println(isUnique1(s));
        }
    }

    // using boolean array
    public static boolean isUnique2(String input) {
        if (input.length() > 128) {
            return false;
        }
        boolean[] chars = new boolean[128];

        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);

            if (chars[val]) {
                return false;
            }
            chars[val] = true;
        }
        return true;
    }

    // test using boolean array
    public static void testIsUnique2(String[] inputCases) {
        for (String s : inputCases) {
            System.out.println(isUnique2(s));
        }
    }

}

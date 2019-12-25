package ArraysAndStrings;

// determine if a string has all unique characters
// what if no data structures are used?

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

    // no data structures: ?

    public static boolean isUnique2(String input) {



        return false;
    }

}

package ArraysAndStrings;

public class Main {

    public static void main (String args[]) {

        // test IsUnique
        IsUnique obj = new IsUnique();
        String[] testedWords = {" ", "a", "ab", "aaa", "abcdea"}; // T, T, T, F, F
        obj.testIsUnique1(testedWords);



    }

}

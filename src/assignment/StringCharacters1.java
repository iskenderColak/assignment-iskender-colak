package assignment;

import java.util.ArrayList;
import java.util.List;

public class StringCharacters1 {

    public static void main(String[] args) {
        System.out.println(isUnique(""));
        System.out.println(isUnique(" "));
        System.out.println(isUnique("e"));
        System.out.println(isUnique("ee"));
        System.out.println(isUnique("exe"));
        System.out.println(isUnique("tree"));
        System.out.println(isUnique("home"));
    }

    private static boolean isUnique(String str) {
        // Creating an arrayList for storing the character of the string
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++){
            if (charList.contains(str.charAt(i))) {
                return false;
            } else {
                charList.add(str.charAt(i));
            }
        }
        return true;
    }

}

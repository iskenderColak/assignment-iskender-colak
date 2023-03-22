package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringCharacters1 {

    public static void main(String[] args) {

        System.out.println(isUnique(null));
        System.out.println(isUnique(""));
        System.out.println(isUnique(" "));
        System.out.println(isUnique("e"));
        System.out.println(isUnique("ee"));
        System.out.println(isUnique("exe"));
        System.out.println(isUnique("tree"));
        System.out.println(isUnique("home"));
    }

    private static boolean isUnique(String str) {

        if (str == null) return true;

        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        return str.length() == charSet.size();
    }
}

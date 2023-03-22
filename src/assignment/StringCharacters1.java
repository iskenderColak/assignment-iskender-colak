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

        // If the string is null, return true
        if (str == null) return true;

        // Creating a hashSet
        // Duplicates are not allowed in HashSet
        HashSet<Character> charSet = new HashSet<>();

        // Inserting character of String into hashSet
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }

        // If length of string is equal to size of hashSet
        // then there is no duplicate characters in string
        return str.length() == charSet.size();
    }
}

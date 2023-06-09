package assignment;

import java.util.Arrays;
import java.util.HashSet;

public class StringCharacters {

    public static void main(String[] args) {
                                                        // Expected values
        System.out.println(isUniqueWithDS(null));   // true
        System.out.println(isUniqueWithDS(""));     // true
        System.out.println(isUniqueWithDS(" "));    // true
        System.out.println(isUniqueWithDS("  "));   // false
        System.out.println(isUniqueWithDS("e"));    // true
        System.out.println(isUniqueWithDS("ee"));   // false
        System.out.println(isUniqueWithDS("exe"));  // false
        System.out.println(isUniqueWithDS("tree")); // false
        System.out.println(isUniqueWithDS("home")); // true

        System.out.println("---------------------------------");

        System.out.println(isUniqueWithoutDS(null));  // true
        System.out.println(isUniqueWithoutDS(""));    // true
        System.out.println(isUniqueWithoutDS(" "));   // true
        System.out.println(isUniqueWithoutDS("  "));  // false
        System.out.println(isUniqueWithoutDS("e"));   // true
        System.out.println(isUniqueWithoutDS("ee"));  // false
        System.out.println(isUniqueWithoutDS("exe")); // false
        System.out.println(isUniqueWithoutDS("tree"));// false
        System.out.println(isUniqueWithoutDS("home"));// true

        System.out.println("---------------------------------");

        System.out.println(isUnique(null));  // true
        System.out.println(isUnique(""));    // true
        System.out.println(isUnique(" "));   // true
        System.out.println(isUnique("  "));  // false
        System.out.println(isUnique("e"));   // true
        System.out.println(isUnique("ee"));  // false
        System.out.println(isUnique("exe")); // false
        System.out.println(isUnique("tree"));// false
        System.out.println(isUnique("home"));// true

        printFrequency("iskendercolak");
    }

    // Method with data structure.
    private static boolean isUniqueWithDS(String str) {

        // If the string is null or,
        // length of the string is less than 2,
        // then it can't be any duplicate characters in the string
        if (str == null || str.length() < 2) return true;

        // If execution reaches that line, that means there are at least 2 characters.
        // If this condition matches, that means str contains only space characters (maybe 100000 space!).
        // So, no need to iterate, just return false.
        if (str.isBlank()) return false;

        // Creating a hashSet
        // Duplicates are not allowed in HashSet
        HashSet<Character> charSet = new HashSet<>();

        // Inserting character of String into hashSet
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }

        // If length of string is equal to size of hashSet
        // then there is no duplicate characters in the string
        return str.length() == charSet.size();
    }

    // Method without data structure.
    private static boolean isUniqueWithoutDS(String str) {

        // If the string is null or,
        // length of the string is less than 2,
        // then it can't be any duplicate characters in the string
        if (str == null || str.length() < 2) return true;

        // If execution reaches that line, that means there are at least 2 characters.
        // If this condition matches, that means str contains only space characters (maybe 100000 space!).
        // So, no need to iterate, just return false.
        if (str.isBlank()) return false;

        // If we encounter two same characters, return false
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }

        // If we do not encounter any duplicate character, return true
        return true;
    }

    private static boolean isUnique(String str) {
        if (str == null || str.length() < 2) return true;
        if (str.isBlank()) return false;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (str.indexOf(each) != str.lastIndexOf(each))
                return false;
        }
        return true;
    }

    private static void printFrequency(String str) {

        int n = str.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            if (freq[str.charAt(i) - 'a'] != 0) {
                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " ");
                freq[str.charAt(i) - 'a'] = 0;
            }
        }

    }
}

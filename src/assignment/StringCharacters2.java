package assignment;

public class StringCharacters2 {

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

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

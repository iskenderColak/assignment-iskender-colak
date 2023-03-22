package assignment;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println(Add1(3, 5));
        System.out.println(Add2(3, 5));
    }

    private static int Add1(int a, int b) {
        return Integer.sum(a, b);
    }

    private static int Add2(int a, int b) {
        for (int i = 1; i <= b ; i++) {
            a++;
        }
        return a;
    }
}

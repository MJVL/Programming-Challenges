import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = reader.nextInt();
        System.out.printf("%d = %s", num, formatFactorial(reverseFactorial(num, 2)));
    }

    public static int reverseFactorial(int n, int divisor) {
        if (n / divisor == 1) {
            return n;
        }
        return (n % divisor > 0) ? 0 : reverseFactorial(n / divisor, divisor + 1);
    }

    public static String formatFactorial(int n) {
        return (n == 0) ? "None" : String.format("%d!", n);
    }

}

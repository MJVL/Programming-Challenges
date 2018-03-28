import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        System.out.printf("The population count of %d is %d.", num, populationCount(num));
    }

    public static int populationCount(int n) {
        int pCount = 0;
        while (n > 0) {
            pCount += (n % 2 == 1) ? 1 : 0;
            n /= 2;
        }
        return pCount;
    }
}

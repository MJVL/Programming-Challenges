import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the coin value: ");
        System.out.println(exchange(reader.nextInt()));
    }

    public static int exchange(int n) {
        return (n == 0) ? 1 : exchange(n / 2) + exchange(n / 3) + exchange(n / 4);
    }

}
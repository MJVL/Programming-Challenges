import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the base-width, trunk, and leaves (space-delimited): ");
        String[] arrInput = reader.nextLine().split(" ");
        generateTree(Integer.parseInt(arrInput[0]), arrInput[1].charAt(0), arrInput[2].charAt(0));
    }

    public static void generateTree(int base, char trunk, char leaves) {
        for (int i = 0; i < base / 2 + 1; i++) {
            for (int j = 0; j < base / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(leaves);
            }
            System.out.println();
        }
        for (int i = 0; i < base / 2 - 1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(trunk);
        }
    }

}

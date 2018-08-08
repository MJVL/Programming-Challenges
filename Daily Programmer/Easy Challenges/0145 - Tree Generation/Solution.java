import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the base-width, trunk, and leaves (space-delimited): ");
        String[] arrInput = reader.nextLine().split(" ");
        generateTree(Integer.parseInt(arrInput[0]), arrInput[1].charAt(0), arrInput[2].charAt(0));
    }

    public static void generateTree(int base, char trunk, char leaves) {
        for (int i = 0; i < base / 2 + 1; i++) {
            Stream.generate(() -> " ").limit(base / 2 - i).forEach(System.out::print);
            Stream.generate(() -> leaves).limit(i * 2 + 1).forEach(System.out::print);
            System.out.println();
        }
        Stream.generate(() -> " ").limit(base / 2 - 1).forEach(System.out::print);
        Stream.generate(() -> trunk).limit(3).forEach(System.out::print);
    }

}

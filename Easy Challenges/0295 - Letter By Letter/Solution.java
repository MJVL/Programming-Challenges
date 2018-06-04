import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first sentence: ");
        String s1 = reader.nextLine();
        System.out.print("Enter the second sentence: ");
        String s2 = reader.nextLine();
        letterByLetter(s1, s2);
    }

    public static void letterByLetter(String s1, String s2) {
        System.out.println(s1);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println(s2.substring(0, i + 1) + s1.substring(i + 1));
            }
        }
    }

}

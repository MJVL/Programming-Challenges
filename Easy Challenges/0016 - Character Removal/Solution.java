import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String strOne = reader.nextLine();
        System.out.print("Enter the characters to remove:");
        String strTwo = reader.nextLine();
        System.out.printf("Modified string: %s", removeCharacters(strOne, strTwo));
    }

    public static String removeCharacters(String strOne, String strTwo) {
        for (int i = 0; i < strTwo.length(); i++) {
            strOne = strOne.replaceAll(strTwo.substring(i, i + 1), "");
        }
        return strOne;
    }

}

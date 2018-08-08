import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two words (space-delimited): ");
        String arrWords[] = reader.nextLine().split(" ");
        System.out.println(results(reduceWord(arrWords[0], arrWords[1]), reduceWord(arrWords[1], arrWords[0])));
    }

    public static String reduceWord(String wordOne, String wordTwo) {
        for (char c: wordTwo.toCharArray()) {
            wordOne = wordOne.replaceFirst(Character.toString(c), "");
        }
        return wordOne;
    }

    public static String results(String wordOne, String wordTwo) {
        return String.format("Valley Letters: %s,%s%n%s", wordOne, wordTwo, (wordOne.length() == wordTwo.length()) ? "Tie" : (wordOne.length() > wordTwo.length() ? "Left Wins" : "Right Wins"));
    }

}
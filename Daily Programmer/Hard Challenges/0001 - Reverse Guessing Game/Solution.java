import java.util.Scanner;

public class Solution {

    private static Scanner reader = new Scanner(System.in);
    private static int numGuesses = 0;

    public static void main(String[] args) {
        guess(1,100);
    }

    public static void guess(int lowerBound, int upperBound) {
        numGuesses++;
        int guess = ((lowerBound + upperBound) / 2);
        System.out.format("My guess is %d.%n", guess);
        System.out.println("Is your number [h]igher, [l]ower, or was I [c]orrect?");
        switch (reader.next().charAt(0)) {
            case 'h':
                guess(guess + 1, upperBound);
                break;
            case 'l':
                guess(lowerBound, guess - 1);
                break;
            case 'c':
                System.out.printf("I guessed your number in %d guess(es).%n", numGuesses);
                break;
            default:
                numGuesses--;
                System.out.println("Invalid Input.");
                break;
        }

    }

}
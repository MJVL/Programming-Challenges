import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static final char[][] KEYPAD = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'.' ,'0', ' '}};

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        System.out.printf("%.2fcm", totalDistance(reader.nextLine().toCharArray()));
    }

    public static double totalDistance(char[] inputs) {
        return IntStream.range(0, arrInputs.length - 1).mapToDouble(i -> distance(keypadCoordinate(arrInputs[i]), keypadCoordinate(arrInputs[i + 1]))).sum();
    }

    public static double distance(int a, int b) {
        return Math.sqrt((Math.pow(a[0] - b[0], 2)) + (Math.pow(a[1] - b[1], 2)));
    }

    public static int[] keypadCoordinate(char c) {
        for (int i = 0; i < KEYPAD.length; i++){
            for (int j = 0; j < KEYPAD[0].length; j++){
                if (KEYPAD[i][j] == c){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}

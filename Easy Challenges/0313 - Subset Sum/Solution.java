import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter distinct integers on one line (comma-delimited): ");
        String intSet = reader.nextLine();
        System.out.println(subsetSum(intSet.equals("") ? new int[]{} : Arrays.stream(intSet.replace(" ","").split(",")).mapToInt(Integer::parseInt).toArray()));
    }

    public static boolean subsetSum(int[] intSet) {
        for (int i: intSet) {
            if (Arrays.stream(set).anyMatch(j -> j == 0) || Arrays.stream(set).anyMatch(j -> j == -i)) {
                return true;
            }
        }
        return false;
    }

}
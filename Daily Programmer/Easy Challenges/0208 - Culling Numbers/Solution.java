import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter unsigned integers on one line (space-delimited): ");
        System.out.println(cullNumbers(Arrays.stream(reader.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()));
    }

    public static Set<Integer> cullNumbers(int[] arrNums) {
       Set<Integer> setUnique = new HashSet<Integer>();
       Arrays.stream(arrNums).forEach(setUnique::add);
       return setUnique;
    }

}

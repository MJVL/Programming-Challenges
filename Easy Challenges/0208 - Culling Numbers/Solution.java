import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter unsigned integers on one line: ");
        System.out.println(cullNumbers(Arrays.stream(reader.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()));
    }

    public static Set<Integer> cullNumbers(int[] arrNums) {
       Set<Integer> setUnique = new HashSet<Integer>();
       for (int i: arrNums) {
           setUnique.add(i);
       }
       return setUnique;
    }

}

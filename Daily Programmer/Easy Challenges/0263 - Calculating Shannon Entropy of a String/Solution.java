import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter sequence: ");
        System.out.printf("%.5f", shannonEntropy(reader.nextLine()));
    }

    public static double shannonEntropy(String seq) {
        Map<Character, Integer> mapSymbol = new HashMap<Character, Integer>();
        for (char c: seq.toCharArray()) {
            mapSymbol.put(c, !mapSymbol.containsKey(c) ? 1 : mapSymbol.get(c) + 1);
        }
        double sEntropy = 0.0;
        for (char c: mapSymbol.keySet()) {
            sEntropy -= (double) mapSymbol.get(c) / seq.length() * Math.log((double) mapSymbol.get(c) / seq.length()) / Math.log(2);
        }
        return sEntropy;
    }

}

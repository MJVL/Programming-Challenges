import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter mode (0 - Camel Case, 1 - Snake Case, 2 - Capitalized Snake Case): ");
        int mode = reader.nextInt();
        reader.nextLine();
        System.out.print("Enter series: ");
        System.out.println((mode == 0) ? toCamel(reader.nextLine()) : (mode == 1) ? toSnake(reader.nextLine()) : toUpperSnake(reader.nextLine()));
    }

    public static String toCamel(String series) {
        return series.substring(0, series.indexOf(" ")).toLowerCase() + Stream.of(series.substring(series.indexOf(" ") + 1).split(" ")).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(""));
    }

    public static String toSnake(String series) {
        return series.toLowerCase().replace(" ", "_");
    }

    public static String toUpperSnake(String series) {
        return series.toUpperCase().replace(" ", "_");
    }

}
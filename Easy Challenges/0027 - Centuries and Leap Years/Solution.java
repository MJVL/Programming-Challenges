import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a year: ");
        String sYear = reader.nextLine();
        int yYear = Integer.parseInt(sYear);
        System.out.printf("Century: %d%n", century(sYear));
        System.out.printf("Leap Year: %s", leapYear(yYear) ? "Yes" : "No");
    }

    public static int century(String year) {
        return (Integer.parseInt(year) % 100 != 0) ? Integer.parseInt(year.substring(0,2)) + 1 : Integer.parseInt(year.substring(0,2));
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 & year % 400 == 0);
    }
}

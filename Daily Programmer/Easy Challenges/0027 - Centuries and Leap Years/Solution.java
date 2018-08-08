import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int sYear = Integer.parseInt(reader.nextLine());
        System.out.printf("Century: %d%n", century(String.valueOf(sYear)));
        System.out.printf("Leap Year: %s", leapYear(sYear) ? "Yes" : "No");
    }

    public static int century(String year) {
        return (Integer.parseInt(year) % 100 != 0) ? Integer.parseInt(year.substring(0, 2)) + 1 : Integer.parseInt(year.substring(0, 2));
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 & year % 400 == 0);
    }
    
}

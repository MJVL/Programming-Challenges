import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public static String[] GIFTS = {"twelve drummers drumming", "eleven pipers piping", "ten lords a-leaping", "nine ladies dancing", "eight maids a-milking", "seven swans a-swimming", "six geese a-laying", "five gold rings", "four calling birds", "three french hens", "two turtle doves", "and a partridge in a pear tree"};

    public static void main(String[] args) {
        System.out.println(twelveDaysOfChristmas(0));
    }

    public static String twelveDaysOfChristmas(int day) {
        if (day >= GIFTS.length) {
            return "";
        }
        return "On the " + ordinal(day + 1) + " day of Christmas\nmy true love sent to me:\n" + ((day > 0) ? (Arrays.asList(GIFTS).subList(GIFTS.length - day - 1, GIFTS.length)).stream().map(s -> s + "\n").collect(Collectors.joining()) : GIFTS[GIFTS.length - 1].substring(GIFTS[GIFTS.length - 1].indexOf(" ") + 1) + "\n") + "\n" + twelveDaysOfChristmas(day + 1);
    }

    public static String ordinal(int i) {
        return i % 100 == 11 || i % 100 == 12 || i % 100 == 13 ? i + "th" : i + new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"}[i % 10];
    }

}
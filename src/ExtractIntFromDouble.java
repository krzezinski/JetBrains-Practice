/*
 Here is the method named extractInt that takes a double value and returns an integer value.
 Write just a body of the method. It should return only the integer part of the given value.
 Sample Input 1:    0.55
 Sample Output 1:   0
 Sample Input 2:    3.12
 Sample Output 2:   3
 */
import java.util.Scanner;
public class ExtractIntFromDouble {
    public static int extractInt(double d) {
        return (int) d;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}

/*
 A user inputs a long positive number m. You need to find out what is the
  smallest int number n such that n! > m.
 Sample Input 1:
   6188989133
 Sample Output 1:
   13
 Sample Input 2:
   6
 Sample Output 2:
   4
 */
import java.util.Scanner;
public class SmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int  n = 0;
        while (m > 0) {
            m /= ++n;
        }
        System.out.println(n);
    }
}
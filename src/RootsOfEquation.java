/*
 The roots of a cubic equation
 Given the numbers a, b, c, da,b,c,d. Output in ascending order all the integers
  between 0 and 1000 which are the roots of the equation ax^3 + bx^2 + cx + d = 0.
 If the specified interval does not contain the roots of the equation, do not output anything.
 Remember, that cubic equation always has 3 roots. Keep it in mind in order to optimize the code.
 Sample Input 1:
   -1
   1
   -1
   1
 Sample Output 1:
   1
 Sample Input 2:
   0
   1
   -6
   5
 Sample Output 2:
   1
   5
 */
import java.util.Scanner;
public class RootsOfEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();
        int r4 = scanner.nextInt();
        for (int i = 0; i <= 1000; i++) {
            if (r1 * i * i * i + r2 * i * i + r3 * i + r4 == 0) {
                System.out.println(i);
            }
        }
    }
}
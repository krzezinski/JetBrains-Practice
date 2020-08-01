/*
 Write a program that reads three integer numbers and prints true if exactly
  one number is positive (i.e. > 0).
 Otherwise, it should print false.
 Sample Input 1:
   1 1 1
 Sample Output 1:
   false
 Sample Input 2:
   1 0 -1
 Sample Output 2:
   true
 */
import java.util.Scanner;
public class ExactlyOneParameterIsPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt() > 0 ? 1 : 0;
        int n2 = scanner.nextInt() > 0 ? 1 : 0;
        int n3 = scanner.nextInt() > 0 ? 1 : 0;
        System.out.println(n1 + n2 + n3 == 1);
    }
	/*
	    // Solution 2
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        boolean b1 = int1 > 0;
        boolean b2 = int2 > 0;
        boolean b3 = int3 > 0;
        if (b1) {
            counter++;
        }
        if (b2) {
            counter++;
        }
        if (b3) {
            counter++;
        }
        System.out.println(counter == 1);
		// Solution 3
		Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean onlyFirstIsPositive = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean onlySecondIsPositive = n1 <= 0 && n2 > 0 && n3 <= 0;
        boolean onlyThirdIsPositive = n1 <= 0 && n2 <= 0 && n3 > 0;
        boolean exactlyOneIsPositive =
                        onlyFirstIsPositive ||
                        onlySecondIsPositive ||
                        onlyThirdIsPositive;
        System.out.println(exactlyOneIsPositive);
		// Solution 4
		Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean result = num1 > 0 ^ num2 > 0 ^ num3 > 0 && !(num1 > 0 && num2 > 0 && num3 > 0);
        System.out.println(result);
	*/
}
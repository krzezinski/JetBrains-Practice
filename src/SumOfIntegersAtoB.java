/*
 Print the sum of all integers from a to b including both.
 It is guaranteed that a < b in all test cases.
 Sample Input 1:
   3
   22
 Sample Output 1:
   250
 */
import java.util.Scanner;
public class SumOfIntegersAtoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(((a + b) * (b - a + 1)) / 2);
    }
}
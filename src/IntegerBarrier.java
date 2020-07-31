/*
 Write a program that reads a sequence of integer numbers in a loop and adds up all numbers.
  If a new number is equal to 0, the program must stop the loop and output the accumulated sum.
  When the sum is equal or exceeded 1000 (the barrier), the program should also stop and output
  the value equal to sum – 1000.
 Note, the input can contain extra numbers. Just ignore them.
 Sample Input 1:
   800
   101
   102
   300
   0
 Sample Output 1:
   3
 Sample Input 2:
   103
   105
   109
   0
   1000
 Sample Output 2:
   317
 */
import java.util.Scanner;
public class IntegerBarrier {
    public static void main(String[] args) {
        int intN = 0;
        int sumN = 0;
        Scanner scanner = new Scanner(System.in);
        while ((intN = scanner.nextInt()) != 0) {
            sumN += intN;
            if (sumN > 999) {
                sumN -= 1000;
                break;
            }
        }
        System.out.println(sumN);
    }
}
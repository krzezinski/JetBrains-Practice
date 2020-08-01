/*
 Find the sum of all elements of a sequence, ending with the number 0.
 The number 0 itself is not included into the sequence and serves as a sign of cessation.
 Sample Input 1:
   3
   6
   8
   0
 Sample Output 1:
   17
 */

import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        int intN = 0;
        int sumN = 0;
        Scanner input = new Scanner(System.in);
        while ((intN = input.nextInt()) != 0) {
            sumN += intN;
        }
        System.out.println(sumN);
    }
}
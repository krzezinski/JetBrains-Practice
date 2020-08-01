/*
 Given the sequence of integer numbers (which ends with the number 0).
  Find the largest element of the sequence.
 The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
 Sample Input 1:
   1
   7
   9
   0
 Sample Output 1:
   9
 */
import java.util.Scanner;
public class LargestElementOfSequence {
    public static void main(String[] args) {
        int intN = 0;
        int maxN = 0;
        Scanner input = new Scanner(System.in);
        while ((intN = input.nextInt()) != 0) {
            if (intN > maxN) {
                maxN = intN;
            }
        }
        System.out.println(maxN);
        
		/* Solution 2
        int maxVal = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int no;
        while ((no = sc.nextInt()) != 0) {
            maxVal = Math.max(no, maxVal);
        }
        System.out.println(maxVal);
		*/
    }
}
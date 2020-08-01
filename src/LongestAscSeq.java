/*
 Write a program that reads an array of ints and outputs the length of the longest sequence
  in strictly ascending order. Elements of the sequence must go one after another. A single
  number is assumed to be ordered sequence with the length = 1.
 Input data format
  The first line contains the size of an array.
  The second line contains elements of the array separated by spaces.
 Example
  The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence
   in ascending order is 5. It includes the following elements: 1 2 3 5 7.
 Sample Input 1:
   10
   1 2 4 1 2 3 5 7 4 3
 Sample Output 1:
   5
 */
import java.util.Scanner;
public class LongestAscSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int maxSeq = 1;
        int longSeq = 1;
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < len - 1; i++) {
            if (array[i] < array[i + 1]) {
                longSeq++;
                if (longSeq > maxSeq) {
                    maxSeq = longSeq;
                }
            } else {
                longSeq = 1;
            }
        }
        System.out.println(maxSeq);
		/*
		// Solution 2
        System.out.println("\nSolution 2");
        // Scanner scanner = new Scanner(System.in);
        int len2 = scanner.nextInt();
        int[] array2 = new int[len2];
        int maxSeq2 = 1;
        int longSeq2 = 1;
        for (int i = 0; i < len2; i++) {
            array2[i] = scanner.nextInt();
        }
        for (int i = 1; i < len2; i++) {
            System.out.println("i " + i + ", array-1 " + array2[i-1]+ ", array " + array2[i]);
            if (array2[i] < array2[i - 1]) {
                // New longSeq
                if (longSeq2 > maxSeq2) {
                    maxSeq2 = longSeq2;
                }
                longSeq2 = 1;
            } else {
                longSeq2++;
            }
            if (longSeq2 > maxSeq2) {
                maxSeq2 = longSeq2;
            }
        }
        System.out.println(maxSeq2);
        // Solution 3
        System.out.println("\nSolution 3");
        Scanner s = new Scanner(System.in);
        int len3 = s.nextInt();
        int[] series = new int[len3];
        int a = 1;
        int amax = 1;
        for (int i = 0; i < len3; i++) {
            series[i] = s.nextInt();
        }
        for (int j = 1; j < len3; j++) {
            a = series[j] > series[j-1] ? a + 1 : 1;
            amax = a > amax ? a : amax;
        }
        System.out.println(amax);
		*/
    }
}
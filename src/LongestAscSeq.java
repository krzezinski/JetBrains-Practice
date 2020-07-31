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
    }
}
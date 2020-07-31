/*
 Write a program that reads an array of ints and outputs the maximum pairwise product
  in the given array of non-negative numbers.
 Input data format
  The first line of the input contains the number of elements in the array.
  The second line contains the elements of the array separated by spaces.
  The array always has at least two elements.
 Sample Input 1:
   2
   5 3
 Sample Output 1:
   15
 Sample Input 2:
   3
   10 8 4
 Sample Output 2:
   80
 */
import java.util.Arrays;
import java.util.Scanner;
public class MaxPairwiseProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[len - 1] * array[len - 2]);
    }
}
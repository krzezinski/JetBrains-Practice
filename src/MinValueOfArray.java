/*
 Write a program that reads an array of integers and finds the minimum value of the array.
 Input data format
   The first line contains the size of an array.
   The second line contains elements of the array separated by spaces.
 Output data format
   An integer number representing the minimum in the input array.
 Sample Input 1:
   5
   5 1 4 2 3
 Sample Output 1:
   1
 */
import java.util.Arrays;
import java.util.Scanner;
public class MinValueOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0]);
    }
}
/* Check if an array is sorted ascending
 Write a program that reads an array of int's and checks the array
   is sorted ascending (from smallest to largest number).
 Input data format
   The first line contains the size of an array.
   The second line contains elements of the array separated by spaces.
 Output data format
   Only a single value: true or false.
 Sample Input 1:
   4
   1 2 3 4
 Sample Output 1:
   true
 Sample Input 2:
   4
   1 2 3 0
 Sample Output 2:
   false
 */
import java.util.Scanner;

class IsArraySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        boolean sorted = true;
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < len; i++) {
            if (array[i - 1] > array[i]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}
/*
 Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording
  the result into the new array m×n in size.
 Input data format
   Input the two numbers n and m, not exceeding 100, and then an array n×m in size.
 Output data format
   Output the resulting array. Separate numbers by a single space in the output.
 Sample Input 1:
   3 4
   11 12 13 14
   21 22 23 24
   31 32 33 34
 Sample Output 1:
   31 21 11
   32 22 12
   33 23 13
   34 24 14
 */
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        do {
            n = scanner.nextInt();
            m = scanner.nextInt();
        } while (n > 101 || m > 101);
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int[][] rotatedArray = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                rotatedArray[j][(n - 1) - i] = array[i][j];
            }
        }
        for (int[] ra : rotatedArray) {
            for (int aInt : ra) {
                System.out.print(aInt + " ");
            }
            System.out.println();
        }
    }
}
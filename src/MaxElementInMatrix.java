/*
 Find the indexes of the initial appearance of the maximum element in a matrix.
 Input data format
   On the input, the program receives the size of matrix n and m, and then n lines having m integer numbers in each. n and m do not exceed 100.
 Output data format
   Output two numbers: the row index and the column index, in which the greatest item in the two-dimensional array (matrix) is located. If there are several such elements, output the one, which has the smaller row index; and if row indexes are the same, output the one having the smaller column index.
 Sample Input 1:
   3 4
   0 3 2 4
   2 3 5 5
   5 1 2 3
 Sample Output 1:
   1 2
 Sample Input 2:
   2 2
   -3 -2
   -2 -1
 Sample Output 2:
   1 1
 */

import java.util.Scanner;
public class MaxElementInMatrix {
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
        int maxValue = array[0][0];
        n = 0;
        m = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                if (array[j][i] > maxValue) {
                    maxValue = array[j][i];
                    n = j;
                    m = i;
                }
            }
        }
        System.out.println(n + " " + m);
    }
}
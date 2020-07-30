/*
 Fill the matrix
 Given the number n, not greater than 100. Create the matrix of size n×n and fill it by the following rule.
  Numbers 0 should be stored on the primary diagonal.
  The two diagonals, adjacent to the primary one, should contain numbers 1.
  The next two diagonals - numbers 2, etc.
  Sample input: 5
         output: 0 1 2 3 4
                 1 0 1 2 3
                 2 1 0 1 2
                 3 2 1 0 1
                 4 3 2 1 0
 */
import java.util.Scanner;
public class FillMatrixByNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            n = scanner.nextInt();
        } while (n > 101);
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.abs(i - j);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}

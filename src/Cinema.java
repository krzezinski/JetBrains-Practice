/*
 The cinema has n rows, each row consists of m seats (n and m do not exceed 20). The two-dimensional
  matrix stores the information on the sold tickets, number 1 means that the ticket for this place is
  already sold, the number 0 means that the place is available. You want to buy k tickets to
  the neighboring seats in the same row. Find whether it can be done.
 Input data format
 On the input, the program gets the number of n rows and m seats. Then, there are n lines,
  each containing m numbers (0 or 1) separated by spaces. The last line contains a number k.
 Output data format
 The program should output the number of the row with k consecutive available seats. If there are
  several rows with k available seats, output the first row with these seats. If there is no such
  a row, output the number 0.
 Sample Input 1:  3 4
                  0 1 0 1
                  1 1 0 1
                  1 0 0 1
                  2
 Sample Output 1: 3
 Sample Input 2:  3 3
                  0 1 0
                  1 0 0
                  1 1 1
                  3
 Sample Output 2: 0
 */
import java.util.Scanner;
    public class Cinema {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = 0; // rows
            int m = 0; // seats
            int k = 0; // consecutive available seats
            do {
                n = scanner.nextInt();
                m = scanner.nextInt();
            } while (n > 21 || m > 21);
            int[][] array = new int[n][m];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            k = scanner.nextInt();
            boolean breakLoop = false;
            int seatCnt = 0;
            int rowCnt = 0;
            for (int j = 0; j < array.length && !breakLoop; j++) {
                rowCnt = j + 1;
                seatCnt = 0;
                for (int i = 0; i < array[j].length && !breakLoop; i++) {
                    if (array[j][i] == 0) {
                        seatCnt++;
                    } else {
                        seatCnt = 0;
                    }
                    if (seatCnt == k) {
                        breakLoop = true;
                    }
                }
            }
            if (!breakLoop) {
                rowCnt = 0;
            }
            System.out.println(rowCnt);
        }
    }

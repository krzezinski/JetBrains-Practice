/*
 In some design style, a 4x4 matrix pattern is considered looking pretty if it doesn't consist of
  a 2x2 matrix of the same color. Your task is to write the program that outputs "YES" if the 4x4
  matrix is looking pretty, otherwise output "NO".
 The input contains 4 lines, each line contains 4 symbols, different symbols represent different
  colors: W stands for white color, B is for black color, R is for red, G is for green, and Y is
  for yellow color.
 Sample Input 1:
   WWWW
   BBBB
   WWWW
   YYYY
 Sample Output 1:
   YES
 Sample Input 2:
   BBBB
   BWWB
   BWWB
   BBBB
 Sample Output 2:
   NO
 */
import java.util.*;

public class PrettyLookingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] array = new char[4][4];
        for (int i = 0; i < 4; i++) {
            array[i] = sc.next().toCharArray();
        }
        boolean isPretty = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == array[i][j + 1] &&
                        array[i][j] == array[i + 1][j] &&
                        array[i][j] == array[i + 1][j + 1]) {
                    isPretty = false;
                }
            }
        }
        System.out.println(isPretty ? "YES" : "NO");
    }
}
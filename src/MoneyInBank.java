/*
 Ann put M money in the bank. The bank increases Ann's deposit by P percent every year.
  Ann wants to know how many years should pass until her deposit in the bank reaches K money.
  Can you help her to answer this question?
 The input contains three integers M, P, K. It is guaranteed that all numbers are positive and K >= M.
 Output the answer to Ann's question.

 Sample Input 1: 1 100 8
 Sample Output 1: 3

 Sample Input 2: 100 15 120
 Sample Output 2: 2
 */
import java.util.Scanner;

public class MoneyInBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble() / 100;
        double k = scanner.nextDouble();
        int years = 0;
        while (m < k) {
            m += m * p;
            years++;
        }
        System.out.println(years);
    }
}

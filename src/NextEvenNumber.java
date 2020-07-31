/*
 Given a natural number, not greater than 10000. Output the even number following this number.
 Sample Input 1:    7
 Sample Output 1:   8
 Sample Input 2:    8
 Sample Output 2:   10
 */
import java.util.Scanner;
public class NextEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = 0;
        do {
            nbr = scanner.nextInt();
        } while (nbr < 0 || nbr > 10_000);
        do {
            nbr++;
        } while (nbr % 2 != 0);
        System.out.println(nbr);
    }
}
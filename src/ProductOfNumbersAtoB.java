/*
 Write a program that prints the product of all integer numbers from a to b (a < b).
 Include a and exclude b from the product.
 Sample Input 1:
   1 2
 Sample Output 1:
   1
 Sample Input 2:
   100 105
 Sample Output 2:
   11035502400
 */
import java.util.Scanner;
public class ProductOfNumbersAtoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long prodOfNbrs = a;
        for (int i = a + 1; i < b; i++) {
            prodOfNbrs *= i;
        }
        System.out.println(prodOfNbrs);
    }
}
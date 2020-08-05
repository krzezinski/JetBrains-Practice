/*
 Write a program that reads a string, and then outputs the string without its middle
 character when the length is odd, and without the middle 2 characters when the length is even.
 Sample Input 1:
   Hello
 Sample Output 1:
   Helo
 Sample Input 2:
   abcd
 Sample Output 2:
   ad
 */
import java.util.Scanner;
public class CuttingOutMiddleOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int inputLength = userInput.length();
        System.out.println(userInput.substring(0, (inputLength - 1) / 2) + userInput.substring(inputLength / 2 + 1));
    }
}
/*
 We need your help to improve an adaptive system. There's a program that asks learners
  what programming language they are learning. There are four options, one of them is correct:
    1. Java
    2. Kotlin
    3. Scala
    4. Python
 Your task: read the answer’s number from the standard input and output the result of
  the test: "Yes!", "No!" or "Unknown number". We hope you know, which answer is correct.
  You don't need to print the question itself.
 */
import java.util.Scanner;
public class TestLearners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userSelection = scanner.nextInt();
        switch (userSelection) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}

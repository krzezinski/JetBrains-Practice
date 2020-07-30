/*
 Residents of the country of Malevia often experiment with the plan of
   their rooms. Rooms can be triangular, rectangular, and round.
 Write a program that calculates the floorage of the rooms.
 Input data format:
   The type of the room shape and the relevant parameters.
 Output data format:
   The area of the resulting room.
 Note that the value of 3.14 is used instead of the number π in Malevia.
 Sample input : rectangle
                4
                10
        output: 40
 */
import java.util.Scanner;
public class FloorSpaceOfRoom {
    public static void main(String[] args) {
        Double a = 0.0;
        Double b = 0.0;
        Double c = 0.0;
        Double r = 0.0;
        Double area = 0.0;
        double s = 0;
        Scanner scanner = new Scanner(System.in);
        String roomShape = scanner.nextLine();
        switch (roomShape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                break;
            case "circle":
                r = scanner.nextDouble();
                area = 3.14 * (r * r);
                break;
            default:
                break;
        }
        System.out.println(area);
    }
}

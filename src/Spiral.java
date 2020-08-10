import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int sideSize = arraySize;
        int squares = (int) Math.ceil(sideSize / 2.0);
        int[][] array = new int[arraySize][arraySize];
        int j;
        int currIndex = 1;
        for (int i = 0; i < squares; i++) {
            for (j = 0; j < sideSize; j++) {
                array[i][i + j] = currIndex++;
            }
            for (j = 1; j < sideSize; j++) {
                array[i + j][arraySize - 1 - i] = currIndex++;
            }
            for (j = sideSize - 2; j > -1; j--) {
                array[arraySize - 1 - i][i + j] = currIndex++;
            }
            for (j = sideSize - 2; j > 0; j--) {
                array[i + j][i] = currIndex++;
            }
            sideSize -= 2;
        }
        for (int[] arrayRow : array) {
            for (int arrayElem : arrayRow) {
                System.out.printf(" " + arrayElem);
            }
            System.out.println();
        }
    }
}
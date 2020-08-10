/*
 The password is hard to crack if it contains at least A uppercase letters, at least B lowercase
  letters, at least C digits and includes exactly N symbols. Also, a password cannot contain
  two or more same characters coming one after another.
 For the given numbers A, B, C, N you should output a password that matches these requirements.
 It is guaranteed A, B, C, and N are non-negative integers and A + B + C <= N. Keep in mind,
  that any parameter can be equal to zero. It means that it's ok if the password doesn't contain
  symbols of such type.
 Sample Input 1:
   3 2 3 10
 Sample Output 1:
   ABAab121AB
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PasswordGen {
    public static ThreadLocalRandom r = ThreadLocalRandom.current();
    public static int[][] array = {
            {0, 65, 91},
            {0, 97, 123},
            {0, 48, 58}
    };
    public static int totalLen = 0;

    public static void fillArray() {
        Scanner scan = new Scanner(System.in);
        array[0][0] = scan.nextInt();
        array[1][0] = scan.nextInt();
        array[2][0] = scan.nextInt();
        totalLen = scan.nextInt();
        int freeChars = totalLen - array[0][0] - array[1][0] - array[2][0];
        if (freeChars < 0) {
            System.exit(1);
        } else if (freeChars > 0) {
            do {
                array[r.nextInt(0, 3)][0]++;
            } while (totalLen - array[0][0] - array[1][0] - array[2][0] > 0);
        }
    }

    public static int genPasswordInt(int prevInt, int lowChar, int highChar) {
        int result = -1;
        do {
            result = r.nextInt(lowChar, highChar);
        } while (result == prevInt);
        return result;
    }

    public static StringBuilder genPassword() {
        StringBuilder password = new StringBuilder();
        int typeChoice = -1;
        int result = -1;
        int prevInt = -1;
        while (totalLen > 0) {
            typeChoice = r.nextInt(0, 3);
            if (array[typeChoice][0] > 0) {
                result = genPasswordInt(prevInt, array[typeChoice][1], array[typeChoice][2]);
                prevInt = result;
                array[typeChoice][0]--;
                totalLen--;
                password.append((char) result);
            }
        }
        return password;
    }

    public static void main(String[] args) {
        fillArray();
        System.out.println(genPassword());
    }
}
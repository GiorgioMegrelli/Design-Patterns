package decorator;

import java.util.Random;

public class ExampleUtil {

    private static final Random random = new Random();

    public static byte[] getRandomBytes() {
        byte[] result = new byte[5 + random.nextInt(4)];
        random.nextBytes(result);
        return result;
    }

    public static void printTestN(int n) {
        System.out.printf("Test #%d:\n", n);
    }

}

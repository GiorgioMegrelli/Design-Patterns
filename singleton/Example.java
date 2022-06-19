package singleton;

import singleton.random.PseudoIntRandom;

import java.util.HashSet;
import java.util.Set;

public class Example {

    private static final int SIZE = 7;
    private static final int STEP = 1_000 * SIZE;

    private static int modulus(int x) {
        x %= SIZE;
        if (x < 0) {
            x += SIZE;
        }
        return x;
    }

    public static void main(String[] args) {
        Set<PseudoIntRandom> instances = new HashSet<>();
        int[] frequencies = new int[SIZE];

        for (int i = 0; i < STEP; i++) {
            PseudoIntRandom pseudoIntRandom = PseudoIntRandom.getInstance();
            instances.add(pseudoIntRandom);
            frequencies[modulus(pseudoIntRandom.nextInt())]++;
        }

        if (instances.size() == 1) {
            System.out.println("All instances are SAME!");
        }
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d: %d%n", i, frequencies[i]);
        }
    }

}

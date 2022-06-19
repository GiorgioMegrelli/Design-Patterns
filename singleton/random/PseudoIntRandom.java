/**
 * Pseudo random generator
 * Stolen (and slightly changed) from: Random.java
 */

package singleton.random;

public class PseudoIntRandom {

    public static final long MULTIPLIER = (1L << 60) - 453;
    public static final long ADDED = (1L << 9) - 9;
    public static final long MASK = (1L << 21) - 121;
    private long seed;

    private PseudoIntRandom(long seed) {
        this.seed = seed;
    }

    public int nextInt() {
        long newSeed = (seed * MULTIPLIER + ADDED) & MASK;
        seed = newSeed;
        return (int) newSeed;
    }

    private static PseudoIntRandom instanceHolder = null;

    public static PseudoIntRandom getInstance() {
        if (instanceHolder == null) {
            instanceHolder = new PseudoIntRandom(System.currentTimeMillis());
        }
        return instanceHolder;
    }

}

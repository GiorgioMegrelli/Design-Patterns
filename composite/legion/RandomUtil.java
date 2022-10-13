package composite.legion;

import java.util.Random;

public class RandomUtil {

    private final static Random random = new Random();

    public static int randomRange(int minInclusive, int maxInclusive) {
        if(minInclusive > maxInclusive) {
            int tmp = maxInclusive;
            maxInclusive = minInclusive;
            minInclusive = tmp;
        }
        return minInclusive + random.nextInt(maxInclusive - minInclusive + 1);
    }

}

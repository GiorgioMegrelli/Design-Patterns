package ge.patterns.design;

import static java.util.Objects.requireNonNull;

public class StringUtils {
    public static final String SPACE = " ";
    public static final String NL = "\n";

    private StringUtils() {}

    public static String tab(int count) {
        if(count <= 0) {
            throw new RuntimeException("Invalid length: " + count);
        }
        return repeat(SPACE, count);
    }

    public static String repeat(String s, int count) {
        if(count < 0) {
            throw new RuntimeException("Invalid count: " + count);
        }
        return requireNonNull(s).repeat(count);
    }
}

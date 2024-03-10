import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

public class ConsoleStyle {
    private static final String BOLD_PREFIX_ESCAPE = "\033[1m";
    private static final String LIGHT_PREFIX_ESCAPE = "\033[2m";
    private static final String ITALIC_PREFIX_ESCAPE = "\033[3m";
    private static final String CANCEL_ESCAPE = "\033[0m";

    private static boolean status = true;

    private ConsoleStyle() {}

    public static String bold(String text) {
        return withPrefix(BOLD_PREFIX_ESCAPE, text);
    }

    public static String light(String text) {
        return withPrefix(LIGHT_PREFIX_ESCAPE, text);
    }

    public static String italic(String text) {
        return withPrefix(ITALIC_PREFIX_ESCAPE, text);
    }

    public static <T> T withStatus(boolean active, Supplier<T> closure) {
        status = active;
        T result = closure.get();
        status = true;
        return result;
    }

    private static String withPrefix(String prefix, String text) {
        requireNonNull(text);
        if(!status) return text;
        return prefix + text + CANCEL_ESCAPE;
    }
}

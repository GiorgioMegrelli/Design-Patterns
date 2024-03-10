import org.gradle.api.Task;
import org.gradle.api.tasks.JavaExec;
import org.gradle.api.tasks.bundling.Jar;
import org.gradle.api.tasks.compile.JavaCompile;
import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

import static java.util.Objects.requireNonNull;

public class PatternDetails implements Comparable<PatternDetails> {
    private static final String TAB = StringUtils.tab(4);
    private static final int MAX_LENGTH = 6;

    private final String name;
    private final JavaCompile buildTask;
    private final Jar jarTask;
    private final JavaExec runTask;
    private final Task cleanTask;

    public PatternDetails(String name, JavaCompile buildTask, Jar jarTask, JavaExec runTask, Task cleanTask) {
        this.name = requireNonNull(name);
        this.buildTask = requireNonNull(buildTask);
        this.jarTask = requireNonNull(jarTask);
        this.runTask = requireNonNull(runTask);
        this.cleanTask = requireNonNull(cleanTask);
    }

    public String getName() {
        return name;
    }

    public JavaCompile getBuildTask() {
        return buildTask;
    }

    public Jar getJarTask() {
        return jarTask;
    }

    public JavaExec getRunTask() {
        return runTask;
    }

    public Task getCleanTask() {
        return cleanTask;
    }

    @Override
    public String toString() {
        String prefix = "Pattern('" + name + "' [tasks ";
        StringJoiner joiner = new StringJoiner(", ", prefix, "])");
        joiner.add(taskInfo("build", buildTask));
        joiner.add(taskInfo("jar", jarTask));
        joiner.add(taskInfo("run", runTask));
        joiner.add(taskInfo("clean", cleanTask));
        return joiner.toString();
    }

    public String beautifyString() {
        return beautifyString(true);
    }

    public String beautifyString(boolean useStyles) {
        return ConsoleStyle.withStatus(useStyles, () -> {
            StringJoiner joiner = new StringJoiner("", name + StringUtils.NL, "");
            joiner.add(taskInfoExtended("build", buildTask));
            joiner.add(taskInfoExtended("jar", jarTask));
            joiner.add(taskInfoExtended("run", runTask));
            joiner.add(taskInfoExtended("clean", cleanTask));
            return joiner.toString();
        });
    }

    private static String taskInfo(String name, Task task) {
        requireNonNull(name);
        requireNonNull(task);
        return name + ": " + task.getName();
    }

    private static String taskInfoExtended(String name, Task task) {
        requireNonNull(name);
        requireNonNull(task);
        int spaceRepeat = Math.max(MAX_LENGTH - name.length(), 0);
        String spaces = StringUtils.repeat(StringUtils.SPACE, spaceRepeat);
        return TAB + ConsoleStyle.light(name) + spaces + ":" + task.getName() + StringUtils.NL;
    }

    @Override
    public int compareTo(@NotNull PatternDetails o) {
        if(this == o) return 0;
        return this.name.compareTo(o.name);
    }
}

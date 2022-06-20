package strategy.computer;

import strategy.cpu.CPU;
import strategy.cpu.DefaultCPU;

public class Computer {

    public static final int DIVISOR = 1 << 10;
    public static final String[] POWER_BYTES = {"B", "KB", "MB", "GB", "TB"};

    private CPU cpu;

    public Computer(CPU cpu) {
        resetCpu(cpu);
    }

    public Computer() {
        this(new DefaultCPU());
    }

    public void resetCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public CPU getCpu() {
        return cpu;
    }

    private String toBytesSizeString(long bytes) {
        int index = 0;
        double divBytes = bytes;
        while (index + 1 < POWER_BYTES.length && divBytes >= DIVISOR) {
            divBytes /= DIVISOR;
            index++;
        }
        return String.format("%.2f %s", divBytes, POWER_BYTES[index]);
    }

    public void execute(char[] executable) {
        double millis = cpu.execute(executable);
        String s = toBytesSizeString(executable.length);
        System.out.printf("%s executed in %.3f ms.\n", s, millis);
    }

}

package strategy.cpu;

public class DefaultCPU implements CPU {
    @Override
    public double execute(char[] instructions) {
        return (double) instructions.length / 200;
    }
}

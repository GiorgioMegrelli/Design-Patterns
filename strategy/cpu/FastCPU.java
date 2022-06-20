package strategy.cpu;

public class FastCPU implements CPU {
    @Override
    public double execute(char[] instructions) {
        return (double) instructions.length / 1000;
    }
}

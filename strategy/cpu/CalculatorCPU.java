package strategy.cpu;

public class CalculatorCPU implements CPU {
    @Override
    public double execute(char[] instructions) {
        return instructions.length;
    }
}

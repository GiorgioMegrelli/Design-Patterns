package strategy.cpu;

public interface CPU {

    /**
     * Returns times in milliseconds is need to execute these instructions
     */
    public double execute(char[] instructions);
}

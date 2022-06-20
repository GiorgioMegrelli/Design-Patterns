package strategy;

import strategy.computer.Computer;
import strategy.cpu.CPU;
import strategy.cpu.CalculatorCPU;
import strategy.cpu.FastCPU;

public class Example {

    private static void printCpuClass(CPU cpu) {
        String[] splitName = cpu.getClass().toString().split("\\.");
        System.out.println(splitName[splitName.length - 1]);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        char[] instructions = new char[1 << 14];
        char[] instructions2 = new char[2_400_000];
        CPU[] cpus = {null /* new DefaultCPU() */, new CalculatorCPU(), new FastCPU()};

        for (CPU cpu : cpus) {
            if (cpu != null) {
                computer.resetCpu(cpu);
            }
            printCpuClass(computer.getCpu());
            computer.execute(instructions);
            computer.execute(instructions2);
        }
    }

}

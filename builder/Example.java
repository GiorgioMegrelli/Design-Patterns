package builder;

import builder.computer.Computer;
import builder.computer.ComputerBuilder;
import builder.exception.hardware.NoHardwareProvidedException;
import builder.exception.software.NoSoftwareProvidedException;
import builder.graph.CompleteGraphBuilder;
import builder.hardware.*;
import builder.software.OperatingSystemTypes;

public class Example {

    private static void println(String s) {
        System.out.println(s);
    }

    private static void printExample(int n) {
        System.out.printf("Example %d:\n", n);
    }

    private static void example1() {
        printExample(1);

        try {
            new ComputerBuilder().build().run();
        } catch (NoHardwareProvidedException e) {
            println("No Hardware Component");
        } catch (NoSoftwareProvidedException e) {
            println("No Software Component");
        }

        try {
            ComputerBuilder builder = new ComputerBuilder();
            builder.setCpu(CPUTypes.Type_2);
            builder.setStorage(StorageTypes.GB_128);
            builder.setMemory(MemoryTypes.GB_8);
            builder.setOperatingSystemTypes(OperatingSystemTypes.Desktop);

            Computer computer = builder.build();
            computer.run();
        } catch (NoHardwareProvidedException | NoSoftwareProvidedException e) {
            e.printStackTrace();
        }

        try {
            new ComputerBuilder()
                    .setCpu(CPUTypes.Type_2)
                    .setStorage(StorageTypes.GB_128)
                    .setMemory(MemoryTypes.GB_8)
                    .setOperatingSystemTypes(OperatingSystemTypes.Desktop)
                    .setCamera(CameraTypes.HD)
                    .setHeadphones(HeadphonesTypes.NoiseCancelling)
                    .setKeyboard(KeyboardTypes.Mechanical)
                    .setMouse(MouseTypes.Laser)
                    .build()
                    .run();
        } catch (NoHardwareProvidedException | NoSoftwareProvidedException e) {
            e.printStackTrace();
        }
    }

    private static void example2() {
        printExample(2);

        new CompleteGraphBuilder().build().print();

        CompleteGraphBuilder builder = new CompleteGraphBuilder();
        for (int i = 0; i < 100 - CompleteGraphBuilder.DEFAULT_EDGES; i++) {
            builder.increment();
        }
        builder.build().print();
    }

    public static void main(String[] args) {
        example1();
        example2();
    }

}

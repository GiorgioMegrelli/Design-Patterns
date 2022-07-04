package builder.computer;

import builder.hardware.*;
import builder.software.OperatingSystemTypes;

public class Computer {

    public Computer(
            CPUTypes cpu,
            StorageTypes storage,
            MemoryTypes memory,
            OperatingSystemTypes os,
            CameraTypes camera,
            HeadphonesTypes headphones,
            KeyboardTypes keyboard,
            MouseTypes mouse
    ) {
    }

    public void run() {
        System.out.println("Computer run!");
    }

}

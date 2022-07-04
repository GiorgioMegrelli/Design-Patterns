package builder.computer;

import builder.exception.hardware.NoCPUProvidedException;
import builder.exception.hardware.NoHardwareProvidedException;
import builder.exception.hardware.NoMemoryProvidedException;
import builder.exception.hardware.NoStorageProvidedException;
import builder.exception.software.NoOperatingSystemProvidedException;
import builder.exception.software.NoSoftwareProvidedException;
import builder.hardware.*;
import builder.software.OperatingSystemTypes;

public class ComputerBuilder {

    private CPUTypes cpu;
    private StorageTypes storage;
    private MemoryTypes memory;
    private OperatingSystemTypes os;
    private CameraTypes camera;
    private HeadphonesTypes headphones;
    private KeyboardTypes keyboard;
    private MouseTypes mouse;

    public ComputerBuilder() {
        clear();
    }

    public Computer build() throws NoHardwareProvidedException, NoSoftwareProvidedException {
        if (cpu == null) {
            throw new NoCPUProvidedException();
        }
        if (storage == null) {
            throw new NoStorageProvidedException();
        }
        if (memory == null) {
            throw new NoMemoryProvidedException();
        }
        if (os == null) {
            throw new NoOperatingSystemProvidedException();
        }
        Computer instance = new Computer(cpu, storage, memory, os, camera, headphones, keyboard, mouse);
        clear();
        return instance;
    }

    public void clear() {
        cpu = null;
        storage = null;
        memory = null;
        os = null;
        camera = null;
        headphones = null;
        keyboard = null;
        mouse = null;
    }

    public ComputerBuilder setCpu(CPUTypes cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setStorage(StorageTypes storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setMemory(MemoryTypes memory) {
        this.memory = memory;
        return this;
    }

    public ComputerBuilder setOperatingSystemTypes(OperatingSystemTypes os) {
        this.os = os;
        return this;
    }

    public ComputerBuilder setCamera(CameraTypes camera) {
        this.camera = camera;
        return this;
    }

    public ComputerBuilder setHeadphones(HeadphonesTypes headphones) {
        this.headphones = headphones;
        return this;
    }

    public ComputerBuilder setKeyboard(KeyboardTypes keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public ComputerBuilder setMouse(MouseTypes mouse) {
        this.mouse = mouse;
        return this;
    }
}

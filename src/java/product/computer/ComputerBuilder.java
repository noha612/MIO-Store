package product.computer;

import product.*;

public class ComputerBuilder extends ProductBuilder {

    private int ID;
    private String name;
    private String type;
    private String config;
    private String desc;
    private RAM ram;
    private CPU cpu;

    public ComputerBuilder buildId(int ID) {
        this.ID = ID;
        return this;
    }

    public ComputerBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    public ComputerBuilder buildType(String type) {
        this.type = type;
        return this;
    }

    public ComputerBuilder buildConfig(String config) {
        this.config = config;
        return this;
    }

    public ComputerBuilder buildDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public ComputerBuilder buildRam(RAM ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder buildCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public Product build() {
        return new Computer(ID, name, type, config, desc, ram, cpu);
    }

}

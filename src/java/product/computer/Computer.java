package product.computer;

import product.*;

public class Computer extends Product {

    private int ID;
    private String name;
    private String type;
    private String config;
    private String desc;
    private RAM ram;
    private CPU cpu;

    public Computer(int ID, String name, String type, String config, String desc, RAM ram, CPU cpu) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.config = config;
        this.desc = desc;
        this.ram = ram;
        this.cpu = cpu;
    }
    
}

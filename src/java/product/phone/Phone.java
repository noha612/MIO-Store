package product.phone;

import product.*;
import product.computer.CPU;
import product.computer.RAM;
import product.electronic.Brand;

public class Phone extends Product {

    private int ID;
    private Brand brand;
    private CPU cpu;
    private RAM ram;

    public Phone(int ID, Brand brand, CPU cpu, RAM ram) {
        this.ID = ID;
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
    }

}

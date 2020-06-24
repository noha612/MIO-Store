package product.phone;

import product.*;
import product.computer.CPU;
import product.computer.RAM;
import product.electronic.Brand;

public class PhoneBuilder extends ProductBuilder {

    private int ID;
    private Brand brand;
    private CPU cpu;
    private RAM ram;

    public PhoneBuilder buildId(int ID) {
        this.ID = ID;
        return this;
    }

    public PhoneBuilder buildBrand(Brand brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder buildCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public PhoneBuilder buildRAM(RAM ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public Product build() {
        return new Phone(ID, brand, cpu, ram);
    }

}

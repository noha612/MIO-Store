package product.computer;

import product.electronic.Brand;

public class RAM {

    private int ID;
    private Brand brand;
    private int memory;

    public int getID() {
        // TODO - implement RAM.getID
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        // TODO - implement RAM.setID
        throw new UnsupportedOperationException();
    }

    public Brand getBrand() {
        return this.brand;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return this.memory;
    }

    /**
     *
     * @param memory
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

}

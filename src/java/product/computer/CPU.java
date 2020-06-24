package product.computer;

import product.electronic.Brand;

public class CPU {

    private int ID;
    private String name;
    private Brand brand;
    private int hz;

    public int getID() {
        // TODO - implement CPU.getID
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        // TODO - implement CPU.setID
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    public int getHz() {
        return this.hz;
    }

    /**
     *
     * @param hz
     */
    public void setHz(int hz) {
        this.hz = hz;
    }

}

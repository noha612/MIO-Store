package product.electronic;

import product.*;
import product.computer.*;

public class ElectronicsBuilder extends ProductBuilder {

    private int Id;
    private String desc;
    private String type;
    private Brand brand;

    public ElectronicsBuilder buildId(int Id) {
        this.Id = Id;
        return this;
    }

    public ElectronicsBuilder buildDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public ElectronicsBuilder buildType(String type) {
        this.type = type;
        return this;
    }

    public ElectronicsBuilder buildBrand(Brand brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Product build() {
        return new Electronics(Id, desc, type, brand);
    }

}

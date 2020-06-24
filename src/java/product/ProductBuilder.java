package product;

import inventory.Supplier;

public abstract class ProductBuilder {

    private int ID;
    private String name;
    private String description;
    private Supplier supplier;
    private String type;

    public ProductBuilder buildId(int id) {
        this.ID = id;
        return this;
    }

    public ProductBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder buildDesc(String description) {
        this.description = description;
        return this;

    }

    public ProductBuilder buildSupp(Supplier supplier) {
        this.supplier = supplier;
        return this;

    }

    public ProductBuilder buildType(String type) {
        this.type = type;
        return this;

    }

    public abstract Product build();

}

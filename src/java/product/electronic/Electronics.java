package product.electronic;

import product.*;

public class Electronics extends Product {

    private int Id;
    private String desc;
    private String type;
    private Brand brand;

    public Electronics(int Id, String desc, String type, Brand brand) {
        this.Id = Id;
        this.desc = desc;
        this.type = type;
        this.brand = brand;
    }

}

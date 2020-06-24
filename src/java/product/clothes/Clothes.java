package product.clothes;

import product.*;

public class Clothes extends Product {

    private int ID;
    private String age;
    private String sex;
    private Designer designer;

    public Clothes(int ID, String age, String sex, Designer designer) {
        this.ID = ID;
        this.age = age;
        this.sex = sex;
        this.designer = designer;
    }

}

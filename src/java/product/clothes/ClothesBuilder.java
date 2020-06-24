package product.clothes;

import product.*;
import product.computer.*;

public class ClothesBuilder extends ProductBuilder {

    private int ID;
    private String age;
    private String sex;
    private Designer designer;

    public ClothesBuilder buildId(int ID) {
        this.ID = ID;
        return this;
    }

    public ClothesBuilder buildAge(String age) {
        this.age = age;
        return this;
    }

    public ClothesBuilder buildSex(String sex) {
        this.sex = sex;
        return this;
    }

    public ClothesBuilder buildDesigner(Designer designer) {
        this.designer = designer;
        return this;
    }

    @Override
    public Product build() {
        return new Clothes(ID, age, sex, designer);
    }

}

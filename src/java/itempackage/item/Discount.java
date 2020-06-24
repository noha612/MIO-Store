package itempackage.item;

public class Discount extends Promotion {

    private String name;
    private float percent;

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

    public float getPercent() {
        return this.percent;
    }

    /**
     *
     * @param percent
     */
    public void setPercent(float percent) {
        this.percent = percent;
    }

    public Discount() {
        // TODO - implement Discount.Discount
        throw new UnsupportedOperationException();
    }

}

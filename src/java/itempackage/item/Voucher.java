package itempackage.item;

public class Voucher extends Promotion {

    private String name;
    private String code;

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

    public String getCode() {
        return this.code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    public Voucher() {
        // TODO - implement Voucher.Voucher
        throw new UnsupportedOperationException();
    }

}

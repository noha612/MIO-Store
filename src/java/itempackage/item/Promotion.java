package itempackage.item;

import java.util.Date;

public class Promotion {

    private String type;
    private Date expiredDate;

    public String getType() {
        return this.type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Date getExpiredDate() {
        return this.expiredDate;
    }

    /**
     *
     * @param expiredDate
     */
    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Promotion() {
        // TODO - implement Promotion.Promotion
        throw new UnsupportedOperationException();
    }

}

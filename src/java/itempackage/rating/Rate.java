package itempackage.rating;

import customer.Customer;

public class Rate {

    private int star;
    private Customer customer;

    public int getStar() {
        return this.star;
    }

    /**
     *
     * @param star
     */
    public void setStar(int star) {
        this.star = star;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    /**
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Rate() {
        // TODO - implement Rate.Rate
        throw new UnsupportedOperationException();
    }

}

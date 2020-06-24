package payment;

import java.util.*;
import order.Order;

public class Payment {

    Collection<Order> orders;
    private int ID;
    private Long amount;
    private String method;

    public void getAttribute() {
        // TODO - implement Payment.getAttribute
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param attribute
     */
    public void setAttribute(int attribute) {
        // TODO - implement Payment.setAttribute
        throw new UnsupportedOperationException();
    }

    public String getName() {
        // TODO - implement Payment.getName
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        // TODO - implement Payment.setName
        throw new UnsupportedOperationException();
    }

    public String getCurrency() {
        // TODO - implement Payment.getCurrency
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param currency
     */
    public void setCurrency(String currency) {
        // TODO - implement Payment.setCurrency
        throw new UnsupportedOperationException();
    }

    public String getMethod() {
        return this.method;
    }

    /**
     *
     * @param method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    public Payment() {
        // TODO - implement Payment.Payment
        throw new UnsupportedOperationException();
    }

    public void setPaymentType() {
        // TODO - implement Payment.setPaymentType
        throw new UnsupportedOperationException();
    }

}

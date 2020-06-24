/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
@MappedSuperclass
@Table(name = "onlineorder")
@XmlRootElement
public class OnlineorderEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "State")
    private String state;
    @Column(name = "Customer")
    private Integer customer;
    @Id
    @Basic(optional = false)
    @Column(name = "OrderID")
    private Integer orderID;
    @Basic(optional = false)
    @Column(name = "ShippingID")
    private int shippingID;
    @Basic(optional = false)
    @Column(name = "VoucherID")
    private int voucherID;
    @Basic(optional = false)
    @Column(name = "CartID")
    private int cartID;
    @Basic(optional = false)
    @Column(name = "ShippingAddressID")
    private int shippingAddressID;

    public OnlineorderEntitiy() {
    }

    public OnlineorderEntitiy(Integer orderID) {
        this.orderID = orderID;
    }

    public OnlineorderEntitiy(Integer orderID, int shippingID, int voucherID, int cartID, int shippingAddressID) {
        this.orderID = orderID;
        this.shippingID = shippingID;
        this.voucherID = voucherID;
        this.cartID = cartID;
        this.shippingAddressID = shippingAddressID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public int getShippingID() {
        return shippingID;
    }

    public void setShippingID(int shippingID) {
        this.shippingID = shippingID;
    }

    public int getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(int voucherID) {
        this.voucherID = voucherID;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getShippingAddressID() {
        return shippingAddressID;
    }

    public void setShippingAddressID(int shippingAddressID) {
        this.shippingAddressID = shippingAddressID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OnlineorderEntitiy)) {
            return false;
        }
        OnlineorderEntitiy other = (OnlineorderEntitiy) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OnlineorderEntitiy[ orderID=" + orderID + " ]";
    }
    
}

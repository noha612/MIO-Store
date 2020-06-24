/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
@MappedSuperclass
@Table(name = "orderline")
@XmlRootElement
public class OrderlineEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "OnSiteOrderOrderID")
    private int onSiteOrderOrderID;
    @Column(name = "Quantity")
    private Integer quantity;
    @Column(name = "Price")
    private BigInteger price;

    public OrderlineEntitiy() {
    }

    public OrderlineEntitiy(Integer id) {
        this.id = id;
    }

    public OrderlineEntitiy(Integer id, int onSiteOrderOrderID) {
        this.id = id;
        this.onSiteOrderOrderID = onSiteOrderOrderID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getOnSiteOrderOrderID() {
        return onSiteOrderOrderID;
    }

    public void setOnSiteOrderOrderID(int onSiteOrderOrderID) {
        this.onSiteOrderOrderID = onSiteOrderOrderID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderlineEntitiy)) {
            return false;
        }
        OrderlineEntitiy other = (OrderlineEntitiy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OrderlineEntitiy[ id=" + id + " ]";
    }
    
}

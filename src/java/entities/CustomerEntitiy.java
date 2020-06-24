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
@Table(name = "customer")
@XmlRootElement
public class CustomerEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PersonID")
    private Integer personID;
    @Basic(optional = false)
    @Column(name = "CartID")
    private int cartID;
    @Basic(optional = false)
    @Column(name = "MembershipTypeID")
    private int membershipTypeID;
    @Basic(optional = false)
    @Column(name = "BookStoreCardID")
    private int bookStoreCardID;
    @Column(name = "Info")
    private Integer info;

    public CustomerEntitiy() {
    }

    public CustomerEntitiy(Integer personID) {
        this.personID = personID;
    }

    public CustomerEntitiy(Integer personID, int cartID, int membershipTypeID, int bookStoreCardID) {
        this.personID = personID;
        this.cartID = cartID;
        this.membershipTypeID = membershipTypeID;
        this.bookStoreCardID = bookStoreCardID;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getMembershipTypeID() {
        return membershipTypeID;
    }

    public void setMembershipTypeID(int membershipTypeID) {
        this.membershipTypeID = membershipTypeID;
    }

    public int getBookStoreCardID() {
        return bookStoreCardID;
    }

    public void setBookStoreCardID(int bookStoreCardID) {
        this.bookStoreCardID = bookStoreCardID;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personID != null ? personID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerEntitiy)) {
            return false;
        }
        CustomerEntitiy other = (CustomerEntitiy) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CustomerEntitiy[ personID=" + personID + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
@Table(name = "feedback")
@XmlRootElement
public class FeedbackEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ItemID")
    private int itemID;
    @Basic(optional = false)
    @Column(name = "CustomerPersonID")
    private int customerPersonID;
    @Column(name = "Content")
    private String content;
    @Column(name = "Rate")
    private Integer rate;
    @Basic(optional = false)
    @Column(name = "CustomerName")
    private String customerName;
    @Basic(optional = false)
    @Column(name = "ItemID2")
    private int itemID2;

    public FeedbackEntitiy() {
    }

    public FeedbackEntitiy(Integer id) {
        this.id = id;
    }

    public FeedbackEntitiy(Integer id, int itemID, int customerPersonID, String customerName, int itemID2) {
        this.id = id;
        this.itemID = itemID;
        this.customerPersonID = customerPersonID;
        this.customerName = customerName;
        this.itemID2 = itemID2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getCustomerPersonID() {
        return customerPersonID;
    }

    public void setCustomerPersonID(int customerPersonID) {
        this.customerPersonID = customerPersonID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getItemID2() {
        return itemID2;
    }

    public void setItemID2(int itemID2) {
        this.itemID2 = itemID2;
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
        if (!(object instanceof FeedbackEntitiy)) {
            return false;
        }
        FeedbackEntitiy other = (FeedbackEntitiy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FeedbackEntitiy[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
@MappedSuperclass
@Table(name = "importingrecord")
@XmlRootElement
public class ImportingrecordEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ImportingStaffPersonID")
    private int importingStaffPersonID;
    @Basic(optional = false)
    @Column(name = "SupplierID")
    private int supplierID;
    @Basic(optional = false)
    @Column(name = "BookID")
    private int bookID;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "ItemID")
    private int itemID;
    @Column(name = "ItemID2")
    private Integer itemID2;

    public ImportingrecordEntitiy() {
    }

    public ImportingrecordEntitiy(Integer id) {
        this.id = id;
    }

    public ImportingrecordEntitiy(Integer id, int importingStaffPersonID, int supplierID, int bookID, int itemID) {
        this.id = id;
        this.importingStaffPersonID = importingStaffPersonID;
        this.supplierID = supplierID;
        this.bookID = bookID;
        this.itemID = itemID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getImportingStaffPersonID() {
        return importingStaffPersonID;
    }

    public void setImportingStaffPersonID(int importingStaffPersonID) {
        this.importingStaffPersonID = importingStaffPersonID;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public Integer getItemID2() {
        return itemID2;
    }

    public void setItemID2(Integer itemID2) {
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
        if (!(object instanceof ImportingrecordEntitiy)) {
            return false;
        }
        ImportingrecordEntitiy other = (ImportingrecordEntitiy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ImportingrecordEntitiy[ id=" + id + " ]";
    }

}

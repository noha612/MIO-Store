/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
@Embeddable
public class ItemBookEntitiyPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ItemID")
    private int itemID;
    @Basic(optional = false)
    @Column(name = "BookID")
    private int bookID;
    @Basic(optional = false)
    @Column(name = "ItemID2")
    private int itemID2;

    public ItemBookEntitiyPK() {
    }

    public ItemBookEntitiyPK(int itemID, int bookID, int itemID2) {
        this.itemID = itemID;
        this.bookID = bookID;
        this.itemID2 = itemID2;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
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
        hash += (int) itemID;
        hash += (int) bookID;
        hash += (int) itemID2;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemBookEntitiyPK)) {
            return false;
        }
        ItemBookEntitiyPK other = (ItemBookEntitiyPK) object;
        if (this.itemID != other.itemID) {
            return false;
        }
        if (this.bookID != other.bookID) {
            return false;
        }
        if (this.itemID2 != other.itemID2) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ItemBookEntitiyPK[ itemID=" + itemID + ", bookID=" + bookID + ", itemID2=" + itemID2 + " ]";
    }

}

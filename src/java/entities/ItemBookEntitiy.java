/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
@MappedSuperclass
@Table(name = "item_book")
@XmlRootElement
public class ItemBookEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemBookEntitiyPK itemBookEntitiyPK;

    public ItemBookEntitiy() {
    }

    public ItemBookEntitiy(ItemBookEntitiyPK itemBookEntitiyPK) {
        this.itemBookEntitiyPK = itemBookEntitiyPK;
    }

    public ItemBookEntitiy(int itemID, int bookID, int itemID2) {
        this.itemBookEntitiyPK = new ItemBookEntitiyPK(itemID, bookID, itemID2);
    }

    public ItemBookEntitiyPK getItemBookEntitiyPK() {
        return itemBookEntitiyPK;
    }

    public void setItemBookEntitiyPK(ItemBookEntitiyPK itemBookEntitiyPK) {
        this.itemBookEntitiyPK = itemBookEntitiyPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemBookEntitiyPK != null ? itemBookEntitiyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemBookEntitiy)) {
            return false;
        }
        ItemBookEntitiy other = (ItemBookEntitiy) object;
        if ((this.itemBookEntitiyPK == null && other.itemBookEntitiyPK != null) || (this.itemBookEntitiyPK != null && !this.itemBookEntitiyPK.equals(other.itemBookEntitiyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ItemBookEntitiy[ itemBookEntitiyPK=" + itemBookEntitiyPK + " ]";
    }
    
}

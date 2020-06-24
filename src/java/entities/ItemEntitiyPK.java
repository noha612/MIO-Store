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
public class ItemEntitiyPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @Column(name = "ID2")
    private int id2;

    public ItemEntitiyPK() {
    }

    public ItemEntitiyPK(int id, int id2) {
        this.id = id;
        this.id2 = id2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) id2;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemEntitiyPK)) {
            return false;
        }
        ItemEntitiyPK other = (ItemEntitiyPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.id2 != other.id2) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ItemEntitiyPK[ id=" + id + ", id2=" + id2 + " ]";
    }
    
}

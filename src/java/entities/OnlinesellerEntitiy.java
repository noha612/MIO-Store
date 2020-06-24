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
@Table(name = "onlineseller")
@XmlRootElement
public class OnlinesellerEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PersonID")
    private Integer personID;
    @Basic(optional = false)
    @Column(name = "OnlineOrderOrderID")
    private int onlineOrderOrderID;

    public OnlinesellerEntitiy() {
    }

    public OnlinesellerEntitiy(Integer personID) {
        this.personID = personID;
    }

    public OnlinesellerEntitiy(Integer personID, int onlineOrderOrderID) {
        this.personID = personID;
        this.onlineOrderOrderID = onlineOrderOrderID;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public int getOnlineOrderOrderID() {
        return onlineOrderOrderID;
    }

    public void setOnlineOrderOrderID(int onlineOrderOrderID) {
        this.onlineOrderOrderID = onlineOrderOrderID;
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
        if (!(object instanceof OnlinesellerEntitiy)) {
            return false;
        }
        OnlinesellerEntitiy other = (OnlinesellerEntitiy) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OnlinesellerEntitiy[ personID=" + personID + " ]";
    }
    
}

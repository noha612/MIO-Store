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
@Table(name = "manager")
@XmlRootElement
public class ManagerEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Level")
    private String level;
    @Id
    @Basic(optional = false)
    @Column(name = "PersonID")
    private Integer personID;

    public ManagerEntitiy() {
    }

    public ManagerEntitiy(Integer personID) {
        this.personID = personID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
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
        if (!(object instanceof ManagerEntitiy)) {
            return false;
        }
        ManagerEntitiy other = (ManagerEntitiy) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ManagerEntitiy[ personID=" + personID + " ]";
    }

}

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
@Table(name = "cpu")
@XmlRootElement
public class CpuEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID2")
    private Integer id2;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Brand")
    private Integer brand;
    @Basic(optional = false)
    @Column(name = "Hz")
    private int hz;

    public CpuEntitiy() {
    }

    public CpuEntitiy(Integer id2) {
        this.id2 = id2;
    }

    public CpuEntitiy(Integer id2, int id, int hz) {
        this.id2 = id2;
        this.id = id;
        this.hz = hz;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public int getHz() {
        return hz;
    }

    public void setHz(int hz) {
        this.hz = hz;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id2 != null ? id2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CpuEntitiy)) {
            return false;
        }
        CpuEntitiy other = (CpuEntitiy) object;
        if ((this.id2 == null && other.id2 != null) || (this.id2 != null && !this.id2.equals(other.id2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CpuEntitiy[ id2=" + id2 + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
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
@Table(name = "employee")
@XmlRootElement
public class EmployeeEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Position")
    private String position;
    @Column(name = "Salary")
    private BigInteger salary;
    @Column(name = "StartDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Id
    @Basic(optional = false)
    @Column(name = "PersonID")
    private Integer personID;
    @Basic(optional = false)
    @Column(name = "BranchStoreID2")
    private int branchStoreID2;
    @Basic(optional = false)
    @Column(name = "BranchStoreID")
    private int branchStoreID;

    public EmployeeEntitiy() {
    }

    public EmployeeEntitiy(Integer personID) {
        this.personID = personID;
    }

    public EmployeeEntitiy(Integer personID, int branchStoreID2, int branchStoreID) {
        this.personID = personID;
        this.branchStoreID2 = branchStoreID2;
        this.branchStoreID = branchStoreID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public int getBranchStoreID2() {
        return branchStoreID2;
    }

    public void setBranchStoreID2(int branchStoreID2) {
        this.branchStoreID2 = branchStoreID2;
    }

    public int getBranchStoreID() {
        return branchStoreID;
    }

    public void setBranchStoreID(int branchStoreID) {
        this.branchStoreID = branchStoreID;
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
        if (!(object instanceof EmployeeEntitiy)) {
            return false;
        }
        EmployeeEntitiy other = (EmployeeEntitiy) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EmployeeEntitiy[ personID=" + personID + " ]";
    }
    
}

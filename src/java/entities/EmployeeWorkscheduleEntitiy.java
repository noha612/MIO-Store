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
@Table(name = "employee_workschedule")
@XmlRootElement
public class EmployeeWorkscheduleEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "WorkScheduleID")
    private int workScheduleID;
    @Basic(optional = false)
    @Column(name = "EmployeePersonID")
    private int employeePersonID;
    @Column(name = "Shift")
    private String shift;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public EmployeeWorkscheduleEntitiy() {
    }

    public EmployeeWorkscheduleEntitiy(Integer id) {
        this.id = id;
    }

    public EmployeeWorkscheduleEntitiy(Integer id, int workScheduleID, int employeePersonID) {
        this.id = id;
        this.workScheduleID = workScheduleID;
        this.employeePersonID = employeePersonID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getWorkScheduleID() {
        return workScheduleID;
    }

    public void setWorkScheduleID(int workScheduleID) {
        this.workScheduleID = workScheduleID;
    }

    public int getEmployeePersonID() {
        return employeePersonID;
    }

    public void setEmployeePersonID(int employeePersonID) {
        this.employeePersonID = employeePersonID;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        if (!(object instanceof EmployeeWorkscheduleEntitiy)) {
            return false;
        }
        EmployeeWorkscheduleEntitiy other = (EmployeeWorkscheduleEntitiy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EmployeeWorkscheduleEntitiy[ id=" + id + " ]";
    }
    
}

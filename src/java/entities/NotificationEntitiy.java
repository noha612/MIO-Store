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
@Table(name = "notification")
@XmlRootElement
public class NotificationEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CustomerPersonID2")
    private int customerPersonID2;
    @Column(name = "Content")
    private String content;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "CustomerPersonID")
    private int customerPersonID;
    @Column(name = "State")
    private Integer state;

    public NotificationEntitiy() {
    }

    public NotificationEntitiy(Integer id) {
        this.id = id;
    }

    public NotificationEntitiy(Integer id, int customerPersonID2, int customerPersonID) {
        this.id = id;
        this.customerPersonID2 = customerPersonID2;
        this.customerPersonID = customerPersonID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCustomerPersonID2() {
        return customerPersonID2;
    }

    public void setCustomerPersonID2(int customerPersonID2) {
        this.customerPersonID2 = customerPersonID2;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomerPersonID() {
        return customerPersonID;
    }

    public void setCustomerPersonID(int customerPersonID) {
        this.customerPersonID = customerPersonID;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        if (!(object instanceof NotificationEntitiy)) {
            return false;
        }
        NotificationEntitiy other = (NotificationEntitiy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.NotificationEntitiy[ id=" + id + " ]";
    }

}

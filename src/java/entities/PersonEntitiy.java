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
@Table(name = "person")
@XmlRootElement
public class PersonEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DateOfBirth")
    private String dateOfBirth;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "IdCard")
    private String idCard;
    @Basic(optional = false)
    @Column(name = "AccountID")
    private int accountID;
    @Basic(optional = false)
    @Column(name = "FullNameID")
    private int fullNameID;
    @Basic(optional = false)
    @Column(name = "ContactInforID")
    private int contactInforID;

    public PersonEntitiy() {
    }

    public PersonEntitiy(Integer id) {
        this.id = id;
    }

    public PersonEntitiy(Integer id, int accountID, int fullNameID, int contactInforID) {
        this.id = id;
        this.accountID = accountID;
        this.fullNameID = fullNameID;
        this.contactInforID = contactInforID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getFullNameID() {
        return fullNameID;
    }

    public void setFullNameID(int fullNameID) {
        this.fullNameID = fullNameID;
    }

    public int getContactInforID() {
        return contactInforID;
    }

    public void setContactInforID(int contactInforID) {
        this.contactInforID = contactInforID;
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
        if (!(object instanceof PersonEntitiy)) {
            return false;
        }
        PersonEntitiy other = (PersonEntitiy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PersonEntitiy[ id=" + id + " ]";
    }
    
}

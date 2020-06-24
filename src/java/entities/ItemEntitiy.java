/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
@MappedSuperclass
@Table(name = "item")
@XmlRootElement
public class ItemEntitiy implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemEntitiyPK itemEntitiyPK;
    @Basic(optional = false)
    @Column(name = "CartID")
    private int cartID;
    @Column(name = "Name")
    private String name;
    @Column(name = "SalePrice")
    private BigInteger salePrice;
    @Column(name = "Description")
    private String description;
    @Column(name = "Feedbacks")
    private String feedbacks;
    @Column(name = "Promotions")
    private String promotions;
    @Column(name = "Date")
    private String date;
    @Column(name = "Name2")
    private String name2;
    @Column(name = "PublishYear")
    private String publishYear;
    @Column(name = "Quantity")
    private Integer quantity;
    @Column(name = "PurchasePrice")
    private BigInteger purchasePrice;
    @Column(name = "Categories")
    private Integer categories;
    @Column(name = "Column")
    private Integer column;
    @Column(name = "Column2")
    private String column2;
    @Column(name = "Type")
    private Integer type;
    @Column(name = "Config")
    private String config;
    @Column(name = "Desc")
    private String desc;
    @Column(name = "Ram")
    private Integer ram;
    @Column(name = "Cpu")
    private Integer cpu;
    @Column(name = "Id3")
    private Integer id3;
    @Column(name = "Desc2")
    private String desc2;
    @Column(name = "Type2")
    private String type2;
    @Column(name = "Brand")
    private Integer brand;
    @Column(name = "ID4")
    private Integer id4;
    @Column(name = "Age")
    private String age;
    @Column(name = "Sex")
    private String sex;
    @Column(name = "Designer")
    private Integer designer;
    @Column(name = "ID5")
    private Integer id5;
    @Column(name = "Brand2")
    private Integer brand2;
    @Column(name = "Cpu2")
    private Integer cpu2;
    @Column(name = "Ram2")
    private Integer ram2;
    @Basic(optional = false)
    @Column(name = "Discriminator")
    private String discriminator;
    @Column(name = "PublisherID")
    private Integer publisherID;
    @Column(name = "AuthorID")
    private Integer authorID;
    @Basic(optional = false)
    @Column(name = "CPUID2")
    private int cpuid2;
    @Basic(optional = false)
    @Column(name = "RAMID2")
    private int ramid2;
    @Basic(optional = false)
    @Column(name = "BrandID2")
    private int brandID2;
    @Basic(optional = false)
    @Column(name = "DesignerID2")
    private int designerID2;

    public ItemEntitiy() {
    }

    public ItemEntitiy(ItemEntitiyPK itemEntitiyPK) {
        this.itemEntitiyPK = itemEntitiyPK;
    }

    public ItemEntitiy(ItemEntitiyPK itemEntitiyPK, int cartID, String discriminator, int cpuid2, int ramid2, int brandID2, int designerID2) {
        this.itemEntitiyPK = itemEntitiyPK;
        this.cartID = cartID;
        this.discriminator = discriminator;
        this.cpuid2 = cpuid2;
        this.ramid2 = ramid2;
        this.brandID2 = brandID2;
        this.designerID2 = designerID2;
    }

    public ItemEntitiy(int id, int id2) {
        this.itemEntitiyPK = new ItemEntitiyPK(id, id2);
    }

    public ItemEntitiyPK getItemEntitiyPK() {
        return itemEntitiyPK;
    }

    public void setItemEntitiyPK(ItemEntitiyPK itemEntitiyPK) {
        this.itemEntitiyPK = itemEntitiyPK;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigInteger salePrice) {
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(String feedbacks) {
        this.feedbacks = feedbacks;
    }

    public String getPromotions() {
        return promotions;
    }

    public void setPromotions(String promotions) {
        this.promotions = promotions;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigInteger getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigInteger purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getCategories() {
        return categories;
    }

    public void setCategories(Integer categories) {
        this.categories = categories;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getId3() {
        return id3;
    }

    public void setId3(Integer id3) {
        this.id3 = id3;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public Integer getId4() {
        return id4;
    }

    public void setId4(Integer id4) {
        this.id4 = id4;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDesigner() {
        return designer;
    }

    public void setDesigner(Integer designer) {
        this.designer = designer;
    }

    public Integer getId5() {
        return id5;
    }

    public void setId5(Integer id5) {
        this.id5 = id5;
    }

    public Integer getBrand2() {
        return brand2;
    }

    public void setBrand2(Integer brand2) {
        this.brand2 = brand2;
    }

    public Integer getCpu2() {
        return cpu2;
    }

    public void setCpu2(Integer cpu2) {
        this.cpu2 = cpu2;
    }

    public Integer getRam2() {
        return ram2;
    }

    public void setRam2(Integer ram2) {
        this.ram2 = ram2;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public Integer getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(Integer publisherID) {
        this.publisherID = publisherID;
    }

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    public int getCpuid2() {
        return cpuid2;
    }

    public void setCpuid2(int cpuid2) {
        this.cpuid2 = cpuid2;
    }

    public int getRamid2() {
        return ramid2;
    }

    public void setRamid2(int ramid2) {
        this.ramid2 = ramid2;
    }

    public int getBrandID2() {
        return brandID2;
    }

    public void setBrandID2(int brandID2) {
        this.brandID2 = brandID2;
    }

    public int getDesignerID2() {
        return designerID2;
    }

    public void setDesignerID2(int designerID2) {
        this.designerID2 = designerID2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemEntitiyPK != null ? itemEntitiyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemEntitiy)) {
            return false;
        }
        ItemEntitiy other = (ItemEntitiy) object;
        if ((this.itemEntitiyPK == null && other.itemEntitiyPK != null) || (this.itemEntitiyPK != null && !this.itemEntitiyPK.equals(other.itemEntitiyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ItemEntitiy[ itemEntitiyPK=" + itemEntitiyPK + " ]";
    }

}

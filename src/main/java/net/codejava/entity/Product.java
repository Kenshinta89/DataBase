package net.codejava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    private Long id;
    private String customer;
    private String so;
    private String po;
    private String stringline;
    private String date;
    private String designer;
    private String folder;

    public Product() {
    }

    protected Product(Long id, String customer, String so, String po, String stringline, String date, String designer, String folder) {
        super();
        this.id = id;
        this.customer = customer;
        this.so = so;
        this.po = po;
        this.stringline = stringline;
        this.date = date;
        this.designer = designer;
        this.folder = folder;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public String getStringline() {
        return stringline;
    }

    public void setStringline(String stringline) {
        this.stringline = stringline;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
    
    

}

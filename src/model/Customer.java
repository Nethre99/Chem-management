/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author 94779
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String country;
    private String address;
    private String mail;
    private String telNumb;
    private String mobile;
    private List<Product> products;

    public Customer(String firstName, String lastName, String country, String address, String mail, String telNumb, String mobile, List<Product> products) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.address = address;
        this.mail = mail;
        this.telNumb = telNumb;
        this.mobile = mobile;
        this.products = products;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelNumb() {
        return telNumb;
    }

    public void setTelNumb(String telNumb) {
        this.telNumb = telNumb;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    
}

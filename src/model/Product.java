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
public class Product {
    private String name;
    private double price;
    private String count;
    private List<Material> meterials;
    private Date changeDate;

    public Product(String name, double price, String count, List<Material> meterials, Date changeDate) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.meterials = meterials;
        this.changeDate = changeDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<Material> getMeterials() {
        return meterials;
    }

    public void setMeterials(List<Material> meterials) {
        this.meterials = meterials;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }
    
    
}

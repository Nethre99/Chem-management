/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author 94779
 */
public class Date {
    private int year;
    private String month;
    private int day;
    
    

    public Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        
        
        
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) { 
        if(monthsAndDays().containsKey(month)){
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(monthsAndDays().containsValue(day)){
          this.day = day;  
        }
    }
    
    private HashMap<String, Integer> monthsAndDays(){
        HashMap<String,Integer> months_days = new HashMap<>();  
        months_days.put("january", 31);
        months_days.put("february", 29);
        months_days.put("march", 31);
        months_days.put("april", 30);
        months_days.put("may", 31);
        months_days.put("june", 30);
        months_days.put("jully", 31);
        months_days.put("august", 31);
        months_days.put("september", 30);
        months_days.put("october", 31);
        months_days.put("november", 30);
        months_days.put("december", 31);
        
        return months_days;
    }
    
}

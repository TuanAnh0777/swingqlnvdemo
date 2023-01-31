/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slide2.demo;

import java.io.Serializable;

public class NewClassListQLNV implements  Serializable{
    private String NVID;
    private String name;
    private String Datetime;
    private int NumberPhone;
    private float coefficient;
    private float salary;

    public NewClassListQLNV() {
    }

    public String getDatetime() {
        return Datetime;
    }

    public void setDatetime(String Datetime) {
        this.Datetime = Datetime;
    }

    public int getNumberPhone() {
        return NumberPhone;
    }

    public void setNumberPhone(int NumberPhone) {
        this.NumberPhone = NumberPhone;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public NewClassListQLNV(String NVID, String name, String Datetime, 
            int NumberPhone, float coefficient, float salary) {
        this.NVID = NVID;
        this.name = name;
        this.Datetime = Datetime;
        this.NumberPhone = NumberPhone;
        this.coefficient = coefficient;
        this.salary = salary;
    }

    public String getNVID() {
        return NVID;
    }

    public void setNVID(String NVID) {
        this.NVID = NVID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}

package com.example.demo.models;

import java.io.Serializable;

public class Address implements Serializable {

    public String Country;
    public String City;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Country='" + Country + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}

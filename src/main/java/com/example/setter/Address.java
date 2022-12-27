package com.example.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;
    private long zipcode;

    public Address() {
    }

    public Address(String city, int zipcode) {
        this.city = city;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }

    public String getCity() {
        return city;
    }
    @Value("${employee.address.city}")
    public void setCity(String city) {
        this.city = city;
    }

    public long getZipcode() {
        return zipcode;
    }
    @Value("${employee.address.zipcode}")
    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }
}

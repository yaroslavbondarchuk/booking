package com.weboot.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Yaroslav Bondarchuk
 *         Date: 02.01.2016
 *         Time: 17:30
 */
@Entity
public class Address {
    @Id
    private Long id;
    @Column
    private String country;
    @Column
    private String city;
    @Column
    private String street;
    @Column
    private String flat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}

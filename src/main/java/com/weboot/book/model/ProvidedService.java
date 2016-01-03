package com.weboot.book.model;

import javax.persistence.*;

/**
 * @author Yaroslav Bondarchuk
 *         Date: 02.01.2016
 *         Time: 17:58
 */
@Entity
public class ProvidedService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

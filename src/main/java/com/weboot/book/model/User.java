package com.weboot.book.model;

import javax.persistence.*;

/**
 * @author Yaroslav Bondarchuk
 *         Date: 02.01.2016
 *         Time: 17:24
 */
@Entity
@Table(name = "application_user")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    private String email;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String phoneNumber;
    @Column
    private String password;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

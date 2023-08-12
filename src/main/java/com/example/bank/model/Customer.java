/*
Müşteri bilgilerini temsil eden bir model sınıfıdır.
Her özellik (name, surname vb.) bir müşterinin farklı özelliklerini saklar.
 */

package com.example.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //sınıfın jpa entity oldugunu belirtir. vt'de tabloya karsilik.
public class Customer {
    @Id //primary keys
    @GeneratedValue(strategy = GenerationType.IDENTITY) //primary key'in oto artan bir deger.
    private Long id;
    private String name;
    private String surname;
    private String identityNo;
    private String password;
    private String email;
    private String phoneNumber;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

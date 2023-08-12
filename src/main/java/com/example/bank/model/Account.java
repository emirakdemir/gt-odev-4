/*
Bu sınıf banka hesaplarını temsil eden bir modeldir.
Her özellik (customerId, ibanNo vb.) bir banka hesabının verilerini tutar.
Getter ve setter metotlarıyla bu özelliklere erişebilir ve değer atayabiliriz.
@Entity ve @Id anotasyanları sayesinde veritabanında bir tabloya karşılık gelir ve JPA ile ilişkilendirilmiş olur.
 */

package com.example.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private String ibanNo;
    private Double currentBalance;
    private CurrencyTypeEnum currencyTypeEnum;
    private AccountTypeEnum accountTypeEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getIbanNo() {
        return ibanNo;
    }

    public void setIbanNo(String ibanNo) {
        this.ibanNo = ibanNo;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public CurrencyTypeEnum getCurrencyTypeEnum() {
        return currencyTypeEnum;
    }

    public void setCurrencyTypeEnum(CurrencyTypeEnum currencyTypeEnum) {
        this.currencyTypeEnum = currencyTypeEnum;
    }

    public AccountTypeEnum getAccountTypeEnum() {
        return accountTypeEnum;
    }

    public void setAccountTypeEnum(AccountTypeEnum accountTypeEnum) {
        this.accountTypeEnum = accountTypeEnum;
    }

    // getter ve setter metotlarını ekleyin
}

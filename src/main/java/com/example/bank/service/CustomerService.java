/*
veriler üzerinde temel create, update, delete, read.
 */

package com.example.bank.service;

import com.example.bank.model.Customer;

public interface CustomerService {
    Customer findByIdentityNo(String identityNo); //kimlik no'ya göre musteri bulmak icin kullanılan metot.
    Customer findByEmail(String email); //e-mail'e göre musteri bulmak icin kullanılan metot.

    void delete(Long id); //musteri silmek icin kullanılan metot. silinecek musterinin kimligi parametredir.

    Customer findById(Long id); //belirli bir kimlige sahip musteriyi bulmak icin

    Customer save(Customer customer); //yeni bir musteri kaydetmek ya da mevcutları guncellemek icin.
}
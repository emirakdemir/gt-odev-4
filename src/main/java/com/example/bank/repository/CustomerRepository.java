/*
spring data jpa tarafından sağlanan repositry arayüzünü kullanarak customer datalarına erişmek için olusturuldu.
 */

package com.example.bank.repository;

import com.example.bank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByIdentityNo(String identityNo); //kimlik no'ya musteriyi bulmak icin

    @Query("SELECT c FROM Customer c WHERE c.email = :email") //e-mail'e gore musteri bulmak icin
    Customer findByEmail(String email);
}
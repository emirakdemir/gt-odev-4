/*
hesap verileri üzerinde temel islemleri gerceklestirmek icin kullanılacak yöntemler.
silme, kaydetme, para cekme, yatırma, liste, bulma.
 */

package com.example.bank.service;

import com.example.bank.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAllByCustomerId(Long customerId); //musterinin tum hesaplarını bulmak icin
    Account findByIbanNo(String ibanNo); // iban noya sahip hesabı bulmak icin

    Account save(Account account); // yeni bir hesabı kaydetmek ya da mevcut hesabı güncellemek icin

    void delete(Long id); // belirli bir hesabı silmek icin, silinecek hesabın parametresi kimlik

    Account withdrawMoney(String ibanNo, Double amount); // belirli IBAN no'ya sahip hesaptan belirli miktarda para çekmek icin

    Account depositMoney(String ibanNo, Double amount); // belirli IBAN no'ya sahip hesaba belirli miktarda para yatirmak icin
}
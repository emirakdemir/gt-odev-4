package com.example.bank.controller;

import com.example.bank.model.Account;
import com.example.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Account> saveAccount(@RequestBody Account account) {
        Account savedAccount = accountService.save(account);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
        accountService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Account>> findAllAccountsByCustomerId(@PathVariable Long customerId) {
        List<Account> accounts = accountService.findAllByCustomerId(customerId);
        return ResponseEntity.ok(accounts);
    }

    @PutMapping("/withdraw/{ibanNo}/{amount}")
    public ResponseEntity<Account> withdrawMoney(@PathVariable String ibanNo, @PathVariable Double amount) {
        Account account = accountService.withdrawMoney(ibanNo, amount);
        return ResponseEntity.ok(account);
    }

    @PutMapping("/deposit/{ibanNo}/{amount}")
    public ResponseEntity<Account> depositMoney(@PathVariable String ibanNo, @PathVariable Double amount) {
        Account account = accountService.depositMoney(ibanNo, amount);
        return ResponseEntity.ok(account);
    }
}
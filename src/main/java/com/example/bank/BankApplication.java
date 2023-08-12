/*
Bu bölümde spring boot uygulamamızın entry point bölümünü oluşturdum.
Bu sınıf spring boot uygulamamızı başlatmak ve çalıştırmak için kullanılır.
 */

package com.example.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankApplication.class, args);
	}

}

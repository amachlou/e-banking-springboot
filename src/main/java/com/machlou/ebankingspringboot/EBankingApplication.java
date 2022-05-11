package com.machlou.ebankingspringboot;

import com.machlou.ebankingspringboot.entities.BankAccount;
import com.machlou.ebankingspringboot.entities.CurrentAccount;
import com.machlou.ebankingspringboot.entities.SavingAccount;
import com.machlou.ebankingspringboot.enums.AccountStatus;
import com.machlou.ebankingspringboot.repositories.BankAccountRepository;
import com.machlou.ebankingspringboot.repositories.CurrentAccountRepository;
import com.machlou.ebankingspringboot.repositories.SavingAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class EBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(BankAccountRepository bankAccountRepository,
								   SavingAccountRepository savingAccountRepository,
								   CurrentAccountRepository currentAccountRepository){
		return args -> {
//			bankAccountRepository.save(new BankAccount(UUID.randomUUID().toString(), new Date(), 15469.08, "DH", AccountStatus.ACTIVE));
			savingAccountRepository.save(new BankAccount(UUID.randomUUID().toString(), new Date(), 15469.08, "DH", AccountStatus.ACTIVE));
			currentAccountRepository.save(new CurrentAccount(8000));
			currentAccountRepository.save(new CurrentAccount(56576));

		};
	}

}

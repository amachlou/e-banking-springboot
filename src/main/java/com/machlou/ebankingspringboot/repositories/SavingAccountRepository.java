package com.machlou.ebankingspringboot.repositories;

import com.machlou.ebankingspringboot.entities.BankAccount;
import com.machlou.ebankingspringboot.entities.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingAccountRepository extends JpaRepository<SavingAccount, String> {
}

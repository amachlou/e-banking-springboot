package com.machlou.ebankingspringboot.repositories;

import com.machlou.ebankingspringboot.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}

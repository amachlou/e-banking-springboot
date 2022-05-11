package com.machlou.ebankingspringboot.repositories;

import com.machlou.ebankingspringboot.entities.CurrentAccount;
import com.machlou.ebankingspringboot.entities.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentAccountRepository extends JpaRepository<CurrentAccount, String> {
}

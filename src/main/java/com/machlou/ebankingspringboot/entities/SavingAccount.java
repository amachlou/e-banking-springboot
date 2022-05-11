package com.machlou.ebankingspringboot.entities;

import com.machlou.ebankingspringboot.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("SA")
@Table(name = "saving_account")
@Data @NoArgsConstructor @AllArgsConstructor
public class SavingAccount extends BankAccount {
    @Column(name = "interest_rate")
    private double interestRate;
}

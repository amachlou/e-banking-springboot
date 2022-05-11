package com.machlou.ebankingspringboot.entities;

import com.machlou.ebankingspringboot.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "disc_type")
@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
    @Id
    @Column(nullable = false, length = 50)
    private String id;
    private Date createdAt;
    private double balance;
    private String currency;
    private AccountStatus status;
}

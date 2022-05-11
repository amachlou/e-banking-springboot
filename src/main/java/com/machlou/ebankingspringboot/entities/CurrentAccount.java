package com.machlou.ebankingspringboot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CA")
@Data @NoArgsConstructor @AllArgsConstructor
@Table(name = "current_account")
public class CurrentAccount extends BankAccount {
    @Column(name = "over_draft")
    private double overDraft;
}

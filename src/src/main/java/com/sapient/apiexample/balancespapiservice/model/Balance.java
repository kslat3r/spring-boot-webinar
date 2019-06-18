package com.sapient.apiexample.balancespapiservice.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "balances")
@Data
public class Balance {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "accountId", nullable = false, unique = true)
    private long accountId;

    @Column(name = "accountName", nullable = false, unique = false)
    private String accountName;

    @Column(name = "accountNumber", nullable = false, unique = false)
    private long accountNumber;

    @Column(name = "accountSortCode", nullable = false, unique = false)
    private long accountSortCode;

    @Column(name = "balance", nullable = false, unique = false)
    private Float balance;
}

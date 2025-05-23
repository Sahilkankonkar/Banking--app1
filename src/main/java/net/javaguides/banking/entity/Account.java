package net.javaguides.banking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountHolderName;
    private double balance;

    // ✅ No-arg constructor required by Hibernate
    public Account() {
    }

    // ✅ All-args constructor
    public Account(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // ✅ Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

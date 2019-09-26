package com.abram.three.atm;

public enum AccountType {
    CREDIT("Credit"),
    CURRENT("Current"),
    DEBIT("Debit");

    private String type;

    private AccountType(String type) {
        this.type = type;
    }
}

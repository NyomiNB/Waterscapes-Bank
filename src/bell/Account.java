/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bell;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author HPro1
 */
public class Account {
private static long accountCounter = 1000000000;
private final long ACCOUNT_NUMBER;
private String type;//checkings/savings
private BigDecimal balance;
private final LocalDate DATE_OPENED;
private boolean isOpen;
private ArrayList<Transaction> transactions = new ArrayList<>();

  
public Account (String type) {
ACCOUNT_NUMBER = ++accountCounter;//stuff++ adds one after entire equation ++stuff adds one then does equation
this.type = type;
balance = new BigDecimal(0);
DATE_OPENED = LocalDate.now();
isOpen = true;
}
public boolean deposit (BigDecimal amount, String type) {
boolean sucessful = false;
if (isOpen && amount.compareTo(BigDecimal.ZERO) == 1) {//compareTo returns -1(less than), 0(equal to), or 1 (greater than)
balance = balance.add(amount);
transactions.add(new Transaction(amount, type));
sucessful = true;                                 
}
return sucessful;
}


public boolean withdraw (BigDecimal amount, String type) {
boolean sucessful = false;
if (isOpen && amount.compareTo(BigDecimal.ZERO) == 1 && amount.compareTo(balance) <= 0 ) {//compareTo returns -1, 0, or 1
balance = balance.subtract(amount);
transactions.add(new Transaction(amount, type));
sucessful = true;                                 
}
return sucessful;
}
    public static long getAccountCounter() {
        return accountCounter;
    }

    public static void setAccountCounter(long accountCounter) {
        Account.accountCounter = accountCounter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public long getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public LocalDate getDATE_OPENED() {
        return DATE_OPENED;
    }

    @Override
    public String toString() {
        return "Account{" + "ACCOUNT_NUMBER=" + ACCOUNT_NUMBER + ", type=" + type + ", balance=" + balance + ", DATE_OPENED=" + DATE_OPENED + ", isOpen=" + isOpen + ", transactions=" + transactions + '}';
    }
//public static void setAccountCounter(long accountCounter) {
//    Account.accountCounter = accountCounter;
//}
}


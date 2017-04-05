package com.boophee.baloo;

import java.util.Date;

/**
 * Created by ashish on 5/4/17.
 */

public class Transaction {
    double amount;
    Date date;
    User user;

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", date=" + date +
                ", user=" + user +
                '}';
    }

    private void setDate(){
        this.date= new Date();
    }

    public Transaction(double amount, User user) {
        setDate();
        this.amount = amount;
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

package com.boophee.baloo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ashish on 5/4/17.
 */

public class Ledger {
    ArrayList<Transaction> transactions;
    double total;
    Date created;

    public Ledger() {
        this.transactions = new ArrayList<Transaction>();
        this.total = 0.0;
        this.created = new Date();
    }

    public Transaction addTransaction(double amount, User user){
        Transaction newTransaction = new Transaction(amount,user);
        transactions.add(newTransaction);
        total+=amount;
        return  newTransaction;
    }

    public double getTotal() {
        return total;
    }

    public int getCount(){
        return this.transactions.size();
    }

    public Transaction getTransactionAtIndex(int index){
        return transactions.get(index);
    }
}

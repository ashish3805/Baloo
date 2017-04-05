package com.boophee.baloo;

/**
 * Created by ashish on 5/4/17.
 */

public class MainContent {
    Ledger ledger;

    public MainContent() {
        super();
        this.ledger=new Ledger();
    }

    public Ledger getLedger() {
        return ledger;
    }
}

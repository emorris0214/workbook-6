package com.pluralsight.finance;

public abstract class FixedAssests implements Valuable {
    protected String name;
    protected double marketValue;

    public FixedAssests(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public abstract double getValue();
}

package com.pluralsight.finance;

public class Jewelry extends FixedAssests{
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue); //
        this.karat = karat;
    }
    @Override
    public double getValue() {
        return karat * 100; //
    }
}

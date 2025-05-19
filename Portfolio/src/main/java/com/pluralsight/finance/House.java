package com.pluralsight.finance;

public class House extends FixedAssests {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int bedrooms, int squareFeet, int yearBuilt) {
        super(name, marketValue); //
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public double getValue() {
        return squareFeet * 120; //
    }
}

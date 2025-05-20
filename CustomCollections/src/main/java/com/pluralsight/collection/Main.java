package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(20);
        numbers.add(1738);
        numbers.add(999);
        numbers.add(1017); // should not be added

        System.out.println("Number list size: " + numbers.getItems().size());
        System.out.println("List of numbers: " + numbers.getItems());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.of(2020,1, 1)); // Where it all went wrong lmao

        System.out.println("Date list size: " + dates.getItems().size());
        System.out.println("List of dates: " + dates.getItems());
    }
}

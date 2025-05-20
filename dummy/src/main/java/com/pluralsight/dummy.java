package com.pluralsight;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

///  Dummy code testing for Quiz 2
public class dummy {
    public void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("data.txt");

            Scanner scanner = new Scanner(fis);
        } catch (IOException e) {

            System.out.println("Error: an unexpected error occurred");

        }
    }
}

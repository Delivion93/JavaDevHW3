package com.yourcompany;

import com.yourcompany.logic.SumCalculator;

public class App {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();

        System.out.println("sumCalculator.sum(1) = " + sumCalculator.sum(1));
        System.out.println("sumCalculator.sum(3) = " + sumCalculator.sum(3));

    }
}
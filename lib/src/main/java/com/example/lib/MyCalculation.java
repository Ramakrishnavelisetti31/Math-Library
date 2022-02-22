package com.example.lib;

public class MyCalculation {

    public Double division(String expression) {
        char[] c = expression.toCharArray();
        double division = 0;

        for (char value : c) {
            if (Character.isDigit(value)) {
                int a = Integer.parseInt(String.valueOf(value));
                division = division * a;
            }
        }
        return division;
    }

    public Double multiply(String expression) {
        char[] c = expression.toCharArray();
        double multiply = 0;

        for (char value : c) {
            if (Character.isDigit(value)) {
                int a = Integer.parseInt(String.valueOf(value));
                multiply = multiply * a;
            }
        }
        return multiply;
    }

    public Double sub(String expression) {
        char[] c = expression.toCharArray();
        double sub = 0;

        for (char value : c) {
            if (Character.isDigit(value)) {
                int a = Integer.parseInt(String.valueOf(value));
                sub = sub + a;
            }
        }
        return sub;
    }

    public Double add(String expression) {
        char[] c = expression.toCharArray();
        double sum = 0;

        for (char value : c) {
            if (Character.isDigit(value)) {
                int a = Integer.parseInt(String.valueOf(value));
                sum = sum + a;
            }
        }
        return sum;
    }
}
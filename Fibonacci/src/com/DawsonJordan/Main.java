package com.DawsonJordan;

public class Main {

    public static void main(String[] args) {

        Fibonacci n1 = new Fibonacci();

        int value = 24;

        int answer = n1.fib(value);
        System.out.println("Fibonacci(" + value + ") = " + answer);
    }
}

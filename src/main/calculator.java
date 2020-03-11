package main;

import java.util.Random;

public class calculator {
    public calculator(){
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor can not be 0! Your param a = " + a + ", b = " + b);
        }
        return a / b;
    }
}
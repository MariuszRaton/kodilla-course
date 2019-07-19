package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {

            System.out.println("Wartość drugiego parametru jest nieprawidłowa ");

        } finally {

            System.out.println("Wartoś pierwszego parametru to " + a + " Wartość drugiego parametru to " + b);

        }

        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}

package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.5,1);
           // secondChallenge.probablyIWillThrowException(2,1.5);
        } catch (Exception e) {
            System.out.println("Wprowadzono błędne parametry. Błąd: " + e);

        } finally {
           System.out.println("Test SecondChallenge");
        }
    }
}

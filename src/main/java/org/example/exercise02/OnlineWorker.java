package org.example.exercise02;

import org.example.exercise01.Worker;

public class OnlineWorker extends Worker {
    private static final double INTERNET_FLAT_RATE = 30.0;

    public OnlineWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + INTERNET_FLAT_RATE;
    }

    @Deprecated
    public void oldInternetMethod() {
        System.out.println("This method is deprecated.");
    }
}


package org.example.exercise01;

public class OnlineWorker extends Worker {
    private static final double INTERNET_FLAT_RATE = 30.0; // Constant

    public OnlineWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + INTERNET_FLAT_RATE;
    }
}


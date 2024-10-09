package org.example.exercise02;

import org.example.exercise01.Worker;

public class OnsiteWorker extends Worker {
    private static final double GASOLINE_COST = 50.0;

    public OnsiteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + GASOLINE_COST;
    }

    @Deprecated
    public void oldGasolineMethod() {
        System.out.println("This method is deprecated.");
    }
}


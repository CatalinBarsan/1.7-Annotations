package org.example.exercise01;

public class OnsiteWorker extends Worker {
    private static final double GASOLINE_COST = 50.0; // Static attribute

    public OnsiteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + GASOLINE_COST;
    }
}

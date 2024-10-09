package org.example.exercise01;

public class Main {
    public static void main(String[] args) {
        Worker onsiteWorker = new OnsiteWorker("John", "Doe", 15.0);
        Worker onlineWorker = new OnlineWorker("Jane", "Smith", 12.0);

        int hoursWorked = 160;

        System.out.println("Onsite worker salary: " + onsiteWorker.calculateSalary(hoursWorked));
        System.out.println("Online worker salary: " + onlineWorker.calculateSalary(hoursWorked));
    }
}


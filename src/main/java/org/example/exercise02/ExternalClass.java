package org.example.exercise02;

public class ExternalClass {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OnsiteWorker onsiteWorker = new OnsiteWorker("John", "Doe", 15.0);
        OnlineWorker onlineWorker = new OnlineWorker("Jane", "Smith", 12.0);

        onsiteWorker.oldGasolineMethod();
        onlineWorker.oldInternetMethod();
    }
}


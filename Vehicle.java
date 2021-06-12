package com.company;

public abstract class Vehicle {

    int Speed;

    public abstract void Drive();

    public abstract void Break();

    public void SignalSound() { //Do not must replace may use standard signal
        System.out.println("Beep beep");
    }

}

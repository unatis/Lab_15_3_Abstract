package com.company;

public abstract class Car extends Vehicle{

    public abstract void OpenDoor();

    public abstract void CloseDoor();

    @Override
    public void Drive() {
        System.out.println("frrrrrrr");
    }

    public void PushGas() {
        System.out.println("Push gas");
    }
}

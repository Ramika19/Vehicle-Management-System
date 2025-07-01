//Part 4 second part
package com.example.Vehicle.Management.System.InterfaceDesign;

public class FlyingCar extends Vehicle implements Driveable, Flyable {

    public FlyingCar(String chassisNumber) {
        super(chassisNumber);
    }

    public void drive() {
        System.out.println("Car flying");
    }

    public void accelerate(int speed) {
        System.out.println("Car accelerating");
    }

    public void brake() {
        System.out.println("Car braking");
    }

    public String getType(){
        return "Flying Car";
    }

    public int calculateTax(){
        return 100;
    }

    public void startEngine(){
        Driveable.super.startEngine();
        Flyable.super.startEngine();
    }
}



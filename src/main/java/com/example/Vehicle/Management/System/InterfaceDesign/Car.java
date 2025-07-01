//Part 3
package com.example.Vehicle.Management.System.InterfaceDesign;

public class Car extends Vehicle implements Driveable{

    public Car(String chassisNumber){
        super(chassisNumber);
    }

    public void drive() {
        System.out.println("driving");
    }

    public void accelerate(int speed) {
        System.out.println("accelerating");
    }

    public void brake() {
        System.out.println("braking");
    }

    public String getType(){
        return "Type";
    }

    public int calculateTax(){
        return 100;
    }
}

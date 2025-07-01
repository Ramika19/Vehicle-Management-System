//Part 2

package com.example.Vehicle.Management.System.InterfaceDesign;

public abstract class Vehicle {
    private int engineSize;
    private static int vehicleCount;
    private final String chassisNumber;

    public Vehicle (String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public abstract String getType();

    public void displayInfo(){
        System.out.println("Type" + getType());
        System.out.println("Ch Num:" + chassisNumber);
        System.out.println("Size:" + engineSize);
        System.out.println("Count:"+vehicleCount);

    }

    public static int getTotalCount(){
        return vehicleCount;
    }

    public final String getChassisNumber(){
        return chassisNumber;
    }

    protected abstract int calculateTax();





    }




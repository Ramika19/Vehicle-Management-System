//Part 4
package com.example.Vehicle.Management.System.InterfaceDesign;

public interface Flyable {
    default void takeOff(){
        System.out.println("Take Off");
    }
    default void startEngine(){
        System.out.println("Start Engine");
    }

}

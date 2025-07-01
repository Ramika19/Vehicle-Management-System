//Part 1
package com.example.Vehicle.Management.System.InterfaceDesign;

public interface Driveable {
     int MAX_SPEED = 200;

     static String getTrafficRules(){
          return "Follow rules";
     }
     default void startEngine(){
          if (checkFuel()){
               System.out.println("Engine starting...");
          }else{
               System.out.println("Engine not starting...");
          }
     }

     private boolean checkFuel(){
          return true;
     }
     void accelerate(int speed);

     public void brake(); //default public

     // 9.
     default void drive(){
          startEngine();
          accelerate(MAX_SPEED);
          brake();
     }


}

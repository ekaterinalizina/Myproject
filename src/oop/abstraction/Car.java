package oop.abstraction;

public interface Car {
    //Interface: is a guideline for future/Proto type design for your reference so that
    //the development team can follow this to develop a complete product.

    //In Interface: we can't declare a variable, but we can declare and assign value during creating value
    //Interface is 100% Abstract. All properties are final. We can't change Value.
    // We can't declare Static variable.
    //We can't create method with body (only without {}), but we can declare a method without body.
    //If we have a Static in the Name of method, Only then we can have body of the method
    //When we implement methods in the class then Method will have a body
    //When we implement properties of Interface, system will implement also values of variables and method
    //to implement in line of class we type "implement" interface Car, then there is pop up window>> implement  OR righ
    //click and implement
    //in main Method we create method (using class Name of class where we creating the object and then call method
    //of interface
    //we don't create Main method in Interface. We will have only one Main method only in one Class. From now on we will
    //create Main m. only in one class.
    //If you change (add ) smth in Interface - again implement
    //We can re-assing value of a variable in Concrete class( which we declared earlier in Interface)
    // if we have Multiple Interfaces. How to handle? We also implements other Interface using: "," write name of
    //other Interface name and right click "public class Tesla implements Car,BoostEngine "
// Class cant implelement other class but Class can extends other class
// One Interface can extends other Interface
//// A class can implements multiple Interface at a time  but can extends A CLASS AT TIME(one).
// Override means == take control, re-assign
    String carName="Toyota";
    static String price="23000";

    //Variable
    String brand="Mercedes";
    int carQuantity=200;
    String sear="2";
    String headLight="4";
    boolean gasTank=true;

    //Method Declare: Abstract
    public void startCar();
    public void stopCar();
    public void wheelCar();
    public void engineCar();
    public void accelerationCar();
    public void stearingCar();
    public void brakeCar();
    public void navigation();

  //  public void display();// if you say Static we need a body
    public static int carDoor(int doorNumber){
        int totalDoor=1*doorNumber;
        System.out.println("door");
        return totalDoor;
    }

    public interface NewCar{
        public void carRoof();
    }

}

package oop.abstraction;

public abstract class ModernCar {
//Abstract class: which is not fully abstract. Abstract means you can declare only method but not a body
// (but only in
//  interface because it is 100% abstract. Class is not 100% abstract, so we can declare a body of a method
// We can use word Abstract when we don't want to create a body of a method

    String modernCarBrand="Audi";
    double modernCarSuggestedPrice=75000;

    //Abstract method

    public abstract void cameras();
    public abstract void autoLaneControl();
    public abstract void selfControl();
    public abstract void autoPark();
    public abstract void gps();
    public abstract void emergencyBreak();
    public abstract void camera360();


    // Static and non Static methods are allowed here
    public void remoteStart(){
        System.out.println("Modern car has remote start feature");
    }

    public static void dualClimateControl(){

        System.out.println("Modern car has dualClimateControl feature");
    }

}

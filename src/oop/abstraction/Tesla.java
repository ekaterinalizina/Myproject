package oop.abstraction;

public class Tesla extends ModernCar implements Car, AutoPilot {
// Concrete class

// A class can implements multiple Interface at a time  but can extends A CLASS AT TIME(one).

    String teslaCarModel="T45";
    double teslaCarT45Price=100000;

    public void teslaCarInfo(){
        System.out.println("Tesla car Info");
    }


    public void startCar() {
        System.out.println("Tesla car has start feature");
    }

    public void stopCar() {
        System.out.println("Tesla car has stop feature");
    }

    public void wheelCar() {
        System.out.println("Tesla car has wheel feature");
    }

    public void engineCar() {
        System.out.println("Tesla car has Engine feature");
    }

    public void accelerationCar() {
        System.out.println("Tesla car has acceleration feature");
    }

    public void stearingCar() {
        System.out.println("Tesla car has steering feature");
    }

    public void brakeCar() {
        System.out.println("Tesla car has brake feature");
    }

    public void navigation() {

    }


    public void cameras() {
        System.out.println("Tesla car has brake feature");
    }

    public void autoLaneControl() {
        System.out.println("Tesla car has autoLaneControl feature");
    }

    public void selfControl() {
        System.out.println("Tesla car has selfControl feature");
    }

    public void autoPark() {
        System.out.println("Tesla car has autoPark feature");
    }

    public void gps() {
        System.out.println("Tesla car has  gps feature");
    }

    public void emergencyBreak() {
        System.out.println("Tesla car has emergencyBreak feature");
    }

    @Override
    public void camera360() {

    }

    public void autoPilot() {
        System.out.println("Tesla car has autoPilot feature");
    }

    public void largeDisplay() {
        System.out.println("Tesla car has largeDisplay feature");
    }

    public void boostEngine() {
        System.out.println("Tesla car has boostEngine feature");
    }

}

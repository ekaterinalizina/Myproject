package oop.polimorphysm.overriding;

import oop.abstraction.ModernCar;

public class BMW extends ModernCar {
    //@Override anotation
    //
    @Override
    public void cameras() {

    }

    @Override
    public void autoLaneControl() {

    }

    @Override
    public void selfControl() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void gps() {

    }

    @Override
    public void emergencyBreak() {

    }

  //Overloading already, but nor Overriding
    public void camera360() {

    }
    public void camera360(String camerName) {
    }

        @Override
    public void remoteStart(){
        System.out.println("BMW car has remote start feature");
    }
}

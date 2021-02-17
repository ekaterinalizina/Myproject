package oop.abstraction;

public class Test {
    public static void main(String[] args) {
        GeneralMotor gm = new GeneralMotor();
        gm.startCar();
        gm.stopCar();
        //   gm.brand="BMW";we can't assign value to a final 'brand'. We can't re-assign
        System.out.println(gm.brand);
        Car.carDoor(2);
        System.out.println(Car.brand);//line 9 is from class General Motor, line 11 from Interface

        Tesla tesla = new Tesla();// we using the same method from one Interface but for different classes
        tesla.startCar();
        tesla.accelerationCar();
        tesla.engineCar();

//        tesla.teslaCarT45Price;
        System.out.println(tesla.teslaCarT45Price);//необходимо сделать оперецию с переменной или задать значение
        tesla.brakeCar();


        //How to create an obj?
        //ClassName objName= new ConstructorOfClass();
        GeneralMotor gm1 = new GeneralMotor();
        gm.startCar();//We have access of all GeneralMotors properties
        Car myCar = new GeneralMotor();//We have some limitations, left side is show which properties the obj will
        //inherit
        myCar.stopCar();
        myCar.startCar();// Overriden methods are also available
        //  myCar.carInfo(); carInfo method belongs to GeneralMotors, but not to a Car interface

        //Car interface (GeneralMotor already implemented Car interface)
        //what is the difference between this 2 objects

        ((GeneralMotor) myCar).carInfo(); //casting interface to Class. to get GeneralMotors properties


        //
    }
}

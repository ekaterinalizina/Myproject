package oop.polimorphysm.overriding;

public class Test {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.remoteStart();//we call from ModernCar class. As BMW if overriding method
        // in BMW class we orriding=changing. But we can change info which is printed.
        //We can change only body!!! We cant change signature, add or change parameters
        //the main intention to use it and change it

        //if we delite @Override annotation sign the system allows to change signature in override method.
        //Then it will be Overloading already and the child class method will be executed

        //Summery:
        //OverLoading we can change method (change parameters)
        // Overriding we have same method and same parameters we can change only body

        Audi audi=new Audi();
        audi.remoteStart();
    }
}

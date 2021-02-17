package oop.abstraction;

public class GeneralMotor implements Car {
//Without main Method it  calls concrete class!!!

    String brand = "BWV";// Re-assing value
    String carModel = "M23";
    String modelYear = "2023";
    static double price = 70000;
    int gmCarQty; // Declare a variable

    public static void carInfo(){
        System.out.println("This is General Motor car");

}
    public boolean willBeAvailable(boolean availability){
        boolean releaseMonth=availability;
        return releaseMonth;
    }
   // public static void main(String[] args) {

    //    GeneralMotor gm= new GeneralMotor();
     //   gm.startCar();
     //   gm.stopCar();



    public void startCar() {
        System.out.println("GeneralMotor car has start feature");
    }

    public void stopCar() {
        System.out.println("GeneralMotor car has stop feature");
    }

    public void wheelCar() {
        System.out.println("GeneralMotor car has wheel ");
    }

    public void engineCar() {
        System.out.println("GeneralMotor car has Engine");
    }

    public void accelerationCar() {
        System.out.println("GeneralMotor car has Acceleration feature");
    }

    public void stearingCar() {
        System.out.println("GeneralMotor car has steering");
    }

    public void brakeCar() {
        System.out.println("GeneralMotor car has start feature");
    }

    public void navigation() {

    }
}

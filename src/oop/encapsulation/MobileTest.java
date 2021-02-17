package oop.encapsulation;

public class MobileTest {
    public static void main(String[] args) {
        Mobile mobile= new Mobile();
        mobile.setCompanyName("Apple");
        System.out.println(mobile.getCompanyName());
        mobile.setSize('s');
        System.out.println(mobile.getSize());
        mobile.setTypeOfCamera("Dual");
        System.out.println(mobile.getTypeOfCamera());
        mobile.setPrice(800);
        System.out.println(mobile.getPrice());
        mobile.setAvailable(true);
        System.out.println(mobile.isAvailable());// no get method !!!






    }


}

package oop.polimorphysm.overloading;

public class Calculator {
    //Method Overloading
    // we can create method with the same name, but with different number of parameters.
    // The signature pattern (parameters) should be different(number of parameters and type of parameters)


    public static void main(String[] args) {
        int number1 = 23;
        int number2 = 33;
        Calculator.doSum(1,2);
        Calculator.doSum(2,4,5,6);
    }

    public static void doSum(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total is" + total);

    }

    public static void doSum(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        System.out.println("Total is" + total);
    }

    public static void doSum(int num1, int num2, int num3, int num4) {
        int total = num1 + num2 + num3 + num4;
        System.out.println("Total is" + total);
    }

    public static void stInfo() {
        System.out.println("Student info");
    }

    public static void stInfo(String name) {
        System.out.println("Student name is " + name);
    }

    public static void stInfo(String name, int age) {
        System.out.println("Student name is  " + name+ "age is "+age);
    }
}

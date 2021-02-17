package controlFlow;

public class LearnEnum {
    //When we create Class we also can create Enum
    //Enum:Enum declaration ca be done outside of a class or inside a class but
    //not inside a method
    //Enum vs Class
    //An Enum can just like a class have attributes and methods.
    //Enum constants are public, static, final. Unchangeable can not be override
    //An Enum can not be used to create objects and it can not extends other classes but
    // it can implement interfaces
    //Use enums when you have values that you knw are not going to change.
    //Enum Value always should be String type


    public static void main(String[] args) {
        System.out.println(Level.HIGH);
        System.out.println(Color.GREEN);
        System.out.println(Color.age);
        System.out.println(Employees.BOB);
        System.out.println(Computer.DELL);
    }

    public void display(){

    }
    public enum Mobile{

    }
    public enum Level{
     HIGH,MEDIUM,LOW // values
    }


    }

enum Computer{
    HP,DELL
}
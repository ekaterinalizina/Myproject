package singleton;

public class LearnSingleton {
    //Singleton class: we are allowed to create one instance of a class at a time.
    //Using private constructor we can ensure that no more than one object can be created at a time

    String collegeName="Queens College";

    private LearnSingleton(){// no one cant have access the code,
        // no one cant create the object, because the modifier is Private
    }

    //Create a instance variable/object

    public static LearnSingleton instance = new LearnSingleton();// we created instance object and we give access modifier Public and Static.
    //instead of instance we can call object abc

    //Create a return type of method
    public static LearnSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        LearnSingleton learn=new LearnSingleton();

    }
}

package oop.polimorphysm.overriding;

public class Audi extends BMW{
    @Override
    public void remoteStart(){
        System.out.println("Audi car has remote start feature");
    }
}

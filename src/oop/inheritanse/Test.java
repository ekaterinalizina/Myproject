package oop.inheritanse;

public class Test {
    public static void main(String[] args) {

        // when Daughter extends Father it is already Hierarchi (because Son also extends Father).
        // Using Getter and Setter method we also have access to private classes
        // Otherwise without using Getter and Setter we can have access only to public info by Inheritance (by extends)
        GrandFather gf=new GrandFather();
        gf.fishing();
        gf.height();



        Father father= new Father();// after extention Father has access to all properties of GF, only public
        father.jump();

        father.beard();
        father.eyes();
        father.goodPersonality();

        Son negash=new Son();
        negash.playGame();
        negash.swim();

        negash.bodyBuilder();
        negash.education();

        Daughter kate=new Daughter();
        kate.tellStories();
        kate.goodPersonality();

        kate.shopping();
        kate.dancing();
        kate.cooking();

    }






}

package oop.inheritanse;

public class GrandFather {

    //Java doesn't allow multiple Inheritance

    //Variable
    public String grandFatherFavouiriteDish="Fish";
    public String grandFatherFavouiriteSport="Soccer";
    public String grandFatherFavouiriteSSN="456783567788";

    public GrandFather(){

    }
    private String grandFatherFavouiriteAccountNumber;

    public GrandFather(String grandFatherFavouiriteDish, String grandFatherFavouiriteSport, String grandFatherFavouiriteSSN) {
        this.grandFatherFavouiriteDish = grandFatherFavouiriteDish;
        this.grandFatherFavouiriteSport = grandFatherFavouiriteSport;
        this.grandFatherFavouiriteSSN = grandFatherFavouiriteSSN;

    }

    public GrandFather(String grandFatherFavouiriteAccountNumber) {
        this.grandFatherFavouiriteAccountNumber = grandFatherFavouiriteAccountNumber;
    }

    public String getGrandFatherFavouiriteAccountNumber() {
        return grandFatherFavouiriteAccountNumber;
    }

    public void setGrandFatherFavouiriteAccountNumber(String grandFatherFavouiriteAccountNumber) {
        this.grandFatherFavouiriteAccountNumber = grandFatherFavouiriteAccountNumber;
    }

    public void fishing(){
        System.out.println("Grandfather like to do fishing");
    }

    public void height(){
        System.out.println("Grandfather like 6.2");
    }

    public void weight(){
        System.out.println("Grandfather like 103");
    }

    public void jump(){
        System.out.println("Grandfather like to jump");
    }

    public void playGame(){
        System.out.println("Grandfather like to play Soccer");
    }

    public void bloodGroup(){
        System.out.println("Grandfather has A-");
    }

    public void tellStories(){
        System.out.println("Grandfather like to tell stories");
    }
    public void loveAnimals(){
        System.out.println("Grandfather like dogs");
    }


}

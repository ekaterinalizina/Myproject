package oop.inheritanse;

public class Father extends GrandFather {

    //Variable
    public String fatherFavouiriteDish="Chicken";
    public String fatherFavouiriteSport="Tennis";
    public String fatherFavouiriteSSN="456783567788";
    private String fatherAccountNumber;

    public Father() {
    }

    public Father(String fatherFavouiriteDish, String fatherFavouiriteSport, String fatherFavouiriteSSN) {
        this.fatherFavouiriteDish = fatherFavouiriteDish;
        this.fatherFavouiriteSport = fatherFavouiriteSport;
        this.fatherFavouiriteSSN = fatherFavouiriteSSN;
    }

    public String getFatherAccountNumber() {
        return fatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        this.fatherAccountNumber = fatherAccountNumber;
    }

    public void swim(){
        System.out.println("Father can swim");
    }

    public void beard(){
        System.out.println("Father doesn't grow");
    }

    public void hairColor(){
        System.out.println("Father has blond hair");
    }

    public void eyes(){
        System.out.println("Father blue eyes");

    }
    public void goodPersonality(){
        System.out.println("Father is calm and kind");
    }

}

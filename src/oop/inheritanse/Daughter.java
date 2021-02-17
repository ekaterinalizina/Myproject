package oop.inheritanse;

public class Daughter extends Father {
    public String daughterFavouiriteDish="Fruits";
    public String daughterFavouiriteSport="Yoga";
    public String daughterFavouiriteSSN="4567867677809";
    private String daughterAccountNumber;

    public Daughter() {
    }

    public Daughter(String daughterFavouiriteDish) {
        this.daughterFavouiriteDish = daughterFavouiriteDish;
    }

    public Daughter(String daughterFavouiriteDish, String daughterFavouiriteSport, String daughterFavouiriteSSN) {
        this.daughterFavouiriteDish = daughterFavouiriteDish;
        this.daughterFavouiriteSport = daughterFavouiriteSport;
        this.daughterFavouiriteSSN = daughterFavouiriteSSN;
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }

    public void cooking(){
        System.out.println("She cooks good");
    }
    public void dancing(){
        System.out.println("She dances nice");
    }

    public void learning(){
        System.out.println("She is one of the best student");
    }
    public void shopping(){
        System.out.println("He likes going shopping");
    }
}

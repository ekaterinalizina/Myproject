package oop.inheritanse;

public class Son extends Father {
  // Father class already extends GrandFather class
  //That is why Son class is already a Multi Inheritance

    public String sonFavouiriteDish="Steak";
    public String sonFavouiriteSport="Basketball";
    public String sonFavouiriteSSN="4567835677809";
    private String sonAccountNumber;

    public Son() {
    }

    public Son(String sonFavouiriteDish) {
        this.sonFavouiriteDish = sonFavouiriteDish;
    }

    public Son(String sonFavouiriteDish, String sonFavouiriteSport, String sonFavouiriteSSN) {
        this.sonFavouiriteDish = sonFavouiriteDish;
        this.sonFavouiriteSport = sonFavouiriteSport;
        this.sonFavouiriteSSN = sonFavouiriteSSN;
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    public void student(){
        System.out.println("He is a good student");
    }

    public void player(){
        System.out.println("He is a good player");
    }
    public void hiking(){
        System.out.println("He is professional hiker");
    }
    public void hairStyle(){
        System.out.println("He has stylish hair Style");
    }
    public void bodyBuilder(){
        System.out.println("He goes at gym a lot");
    }
    public void education(){
        System.out.println("He is one of the best student");
    }
}

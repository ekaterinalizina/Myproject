package oop.encapsulation;

public class Mobile {
    public String mobileModel;
    private String companyName;
    private int price;
    private char size;
    private String typeOfCamera;
    private boolean isAvailable;


    public Mobile() {
    }

    public Mobile(String companyName) {
        this.companyName = companyName;
    }

    public Mobile(String mobileModel, String companyName, int price, char size, String typeOfCamera, boolean isAvailable) {
        this.mobileModel = mobileModel;
        this.companyName = companyName;
        this.price = price;
        this.size = size;
        this.typeOfCamera = typeOfCamera;
        this.isAvailable = isAvailable;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getTypeOfCamera() {
        return typeOfCamera;
    }

    public void setTypeOfCamera(String typeOfCamera) {
        this.typeOfCamera = typeOfCamera;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

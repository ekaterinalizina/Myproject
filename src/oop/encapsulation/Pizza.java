package oop.encapsulation;

public class Pizza {
    //Encapsulation: Data Hiding

    public String pizzaName;
    private String toppingName;
    private int price;
    private char size;
    private String typeOfPizza;
    private boolean isAvailable;

    //Create Constructor short cut - right click>> Generate>> constructor
    public Pizza() {
    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaName, String toppingName) {// one parametr is Public, one is public
        this.pizzaName = pizzaName;
        this.toppingName = toppingName;

    }

    public Pizza(String pizzaName, String toppingName, int price, char size, String typeOfPizza, boolean isAvailable) {
        this.pizzaName = pizzaName;
        this.toppingName = toppingName;
        this.price = price;
        this.size = size;
        this.typeOfPizza = typeOfPizza;
        this.isAvailable = isAvailable;
    }

    //Getter Method and Setter Method (we should create BOTH methods to have an access to private variable.
    //Only for variables

    //Getter Method: Return type
    //private String toppingName;// We use "get" and then choose variable Name to create a method,
    // of a variable to get
    // an access to it. We converted "private variable" to a "public method/public variable"
    public String getToppingName(){
        return toppingName;
    }

    //Setter Method: Non Return type
    //private String toppingName;

    public void setToppingName(String toppingName){
        this.toppingName=toppingName;
    }

// Short cuts for Getter and Setter ->> right click >> generate >> Setter/Getter
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

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

package controlFlow;

public enum Color {
    RED, GREEN, YELLOW, BLUE; // we use UPPER CASE
    String name="James";
    static int age;
    public void tvDisplay(){
        System.out.println("this is TV Display");


    }
    Color(){

    }
    Color(String name){
        this.name=name;
    }
}

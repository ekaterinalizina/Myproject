package datastructureandalgorithm.arrayList;

import java.util.LinkedList;

public class LearnLinkedList {
    //Manipulation with LinkedList is faster than ArrayList

    LinkedList<String> stFathersName= new LinkedList<>();
    LinkedList<String> pizzaList= new LinkedList<>();

    public static void main(String[] args) {
        LearnLinkedList learn= new LearnLinkedList();
        learn.stFathersName.add("William");
        learn.stFathersName.add("Will");
        learn.stFathersName.add("Alli");
        learn.stFathersName.add("Wilgelm");
        learn.stFathersName.add("Windi");
        learn.stFathersName.add("Will");

        System.out.println(learn.stFathersName.get(2));
        //How to retrieve all the value from List

        for(String st: learn.stFathersName){
            System.out.println("Farther's Name "+st);
        }

        learn.getPizzaList();
    }

    public void getPizzaList(){
        pizzaList.add("Margaritta");
        pizzaList.add("Mushroom");
        pizzaList.add("Tuna");
        pizzaList.add("Chicken");
        pizzaList.add("Spinach");
        pizzaList.add("Cheese");
        pizzaList.add("Onion");
        pizzaList.add("SeaFood");

        for(String pz: pizzaList){
            System.out.println("Pizza name :"+ pz);
        }


    }

}

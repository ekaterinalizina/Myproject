package datastructureandalgorithm.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {
    //Stack: LIFO last in first out
    // Pushing element on top of the stack: push()
    //Popping element from the top of the stack: pop() popping and remove
    //Looks at the object at the top of the stack without remove it from the stack: peek();


    public static void main(String[] args) {
        Stack<String> clothingList = new Stack<>();
        clothingList.push("Pant");
        clothingList.push("skirt");
        clothingList.push("hat");
        clothingList.push("gloves");
        clothingList.push("scart");
        clothingList.push("heels");

        System.out.println(clothingList);
        System.out.println(clothingList.push("Apron"));// add the value on top of the stack
        System.out.println(clothingList.pop());


        Stack<String> clothingId = new Stack<>();
        //how to retrieve all the value and pop?
        for(int i=0; i<7; i++){
            clothingId.push("CL"+ i);

        }
        System.out.println(clothingId);
        Iterator it = clothingId.iterator();// Iterator is class
        while(it.hasNext()){
            System.out.println("Pop value: "+ clothingId.pop());
        }
        //Retrive all the value
        for (String st: clothingId){
            System.out.println(st);
        }

        Stack<Integer> priceList= new Stack<>();
        priceList.push(230);
        priceList.push(278);
        priceList.push(290);
        priceList.push(254);
        priceList.push(223);
        priceList.push(295);

        LearnStack.stackSearch(priceList,290);// it shows the position from the End (LIOF order)

    }
    public static void stackSearch(Stack<Integer> sta, int element){
        Integer position = sta.search(element);
        if(position == -1){
            System.out.println("Element not found");

        }else {
            System.out.println("Element found at position "+ position);
        }
    }












}

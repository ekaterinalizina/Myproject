package datastructureandalgorithm.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    //Top element from priority Queue: peek method only peek value from Queue
    public static void main(String[] args) {
        PriorityQueue<String> productList = new PriorityQueue<>();
        productList.add("T-shirt");
        productList.add("Jeans");
        productList.add("Pants");
        productList.add("Belts");
        productList.add("Jacket");
        productList.add("Apple");

        System.out.println(productList.peek());// based on alphabetic order system will call "Belts" >> "B"


        PriorityQueue<Integer> productId= new PriorityQueue<>();
        productId.add(201);
        productId.add(202);
        productId.add(203);
        productId.add(204);
        productId.add(205);
        productId.add(206);
        productId.add(207);
        productId.add(208);

        System.out.println(productId.peek());// it will pick up Accending order (по возрастающей цифры)

        for (Integer in: productId){
            System.out.println("Product Id:"+ in);
        }
        System.out.println("************** using pool Method");
        //Peek() Retrieve but doesnt remove the head of the Queue
        System.out.println(productId.peek());
        //pool() Retrieve and remove the head of the Queue
        System.out.println(productId.poll());
    }



















}

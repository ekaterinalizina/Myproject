package datastructureandalgorithm.sort;

public class LearnRecursion {
    //Recursion: process in which a method calls itself continuously
    /*Must call itself
    must have a base case
    must  change its state and move toward the base case

     */

    static int count=0;
    public static void tvDisplay(){
        count++;// 0   +1 for future
        if(count<10){
            System.out.println("This is TV display");
            tvDisplay();//Recursion method is calling itself//when you call method by itself it is infinite loop.
            //it will show an error.
        }
    }

    public static void main(String[] args) {
        LearnRecursion.tvDisplay();
    }
}

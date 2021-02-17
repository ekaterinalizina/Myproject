package controlFlow;

public class LearnWhileLoop {
    //While loop is used in situation where we do not knw how nany times loop needs to be executed
    //For Loop is used where we already know about the number of times loop needs to be executed
    //Typically for a index used in iteration.

    //While Loop: pre condition check
    //while(condition){++ or --}
    public static void main(String[] args) {
        int age=24;
        while(age>21){
            System.out.println("your age is Grater than 21");
            age--;//iteration point after execution to control the Loop
            // Exit from loop when condtition is false - break;
        }
        System.out.println("*************** Nested While Loop***********");
        int number=24;
        while (number>21){
            int qty=30;// this int can be declared inside child loop
            System.out.println("your age is Grater than 21");
            number--;

            //Nested WhileLoop
            while (qty<35){
                System.out.println("we are ordering Pizza");
                qty++;// controlling loop

            }
        }
    }
}

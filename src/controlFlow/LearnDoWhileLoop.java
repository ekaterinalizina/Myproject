package controlFlow;

public class LearnDoWhileLoop {
    //Post condtion check:
    //Do while loop execute at least one time then it will check condition.
    //do{} while(condition)

    public static void main(String[] args) {
        //First it will execute one time then it will check condition
        int num=26;

        do{
            //do block; Execute this block
            System.out.println("We are learning Do While Loop");
            num--;
        }while(num>20);

        int num2=6;

        do{
            //do block; Execute this block
            System.out.println("We are learning Do While Loop");
            num++;
        }while(num<20);
    }
}

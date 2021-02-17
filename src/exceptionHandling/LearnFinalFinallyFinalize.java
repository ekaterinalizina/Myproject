package exceptionHandling;

public class LearnFinalFinallyFinalize {
    // What is Final, finally, finalize:
    //Garbage collection: Finalize
    //Finalize is used to perform clean up
    // any line of code which could give us a trouble we should keep in try-catch block
    static final int NUMBER = 24;// better to write final variable in UpperCase
    String address;


    public static void main(String[] args) {

        LearnFinalFinallyFinalize lf1 = new LearnFinalFinallyFinalize();
        lf1.doDivision(44, 0);

        LearnFinalFinallyFinalize lf2 = new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf3 = new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf4 = new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf5 = new LearnFinalFinallyFinalize();

        System.gc();// gc- garbage collection, all objects we don't use will go to garbage, unutilized items
    }

    public int doDivision(int num1, int num2) {
        int result = 0;// try to catch and throw it away
        try {            //block, we try
            int result1 = num1 / num2;
            System.out.println("Division value is" + result1);
            System.out.println("We are learning");

        } catch (Exception exception) {// Exception is a class, e - reference variable name
            // exception.printStackTrace(); - we commenting this because it will show an error
            // as we cant math-ly devide on "0"
            //We use Try-Catch not to see Error in Console, but we also mention that there is Logical/Math exception.

            System.out.println("This is Arithmetic exception. Value should be non Zero");


        } finally {// is a block we Must to execute
            System.out.println("hello");
            int total = num1 + num2;
            System.out.println("total value " + total);
        }
        //  }
        return result;// should be outside the block, for that case, usually it is the Last line in Method
    }
}


package debug;

import java.util.Scanner;

public class LearnDebugging {
    //Bug/Error/Deffect
    //Debugging: Identify logical error by yourself
    //BreakPoint- when you execute your code, it will give you break
    //Debug -right click, Debug
    //QA/QE/Software Testing

    //Step Over - it will help to move to next line
    //Step out - one step back
    public static void main(String[] args) {
        //       int num1=20;
        //       int num2=30;
        //       int num3=33;
        //       int num4=43;
//        int num5=53;
        //       int sum= num1-num2;// Logical error (it should be сложение
        //       System.out.println("total"+sum);
    }

    public static void doPattern() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int rowNumber = input.nextInt();

        for (int i = 1; i <= rowNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + " ");
            }
            System.out.println();

        }
    }
}

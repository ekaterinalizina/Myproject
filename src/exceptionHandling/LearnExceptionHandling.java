package exceptionHandling;

import java.util.Scanner;

public class LearnExceptionHandling {
    //Exception:
    // 1) InputMismatchException (for ex. wrong data type
    //2) .ArithmeticException
    // Five key-words to handle exceptions: try, catch, throw, throws, finally

    public static void main(String[] args) {
        Scanner inputNumber =new Scanner(System.in);
        System.out.println("Enter number");
        int num=inputNumber.nextInt();
        System.out.println(num);

        int num1=20;
        int num2=0;
        int result=20/0;
        System.out.println("result "+ result);
    }
}

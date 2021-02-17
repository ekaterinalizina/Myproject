package controlFlow;

import java.util.Scanner;

public class LearnIfElseIf {

    //else if means another IF or adding more condition
    public static void main(String[] args) {

        LearnIfElseIf.retirementCalculator();
    }
    public static void retirementCalculator(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your Age please");
        int age=35;
        if(age<=24 && age <=40){
            System.out.println("your are is more/less than 24");
        }else if(age>=40 && age<=50){
            System.out.println("your age is ore than 40");

        }else if(age >=50 && age<=60){
            System.out.println("your are is more than 50");
        }else{
            System.out.println("its your Retirement Time");
        }
    }
}

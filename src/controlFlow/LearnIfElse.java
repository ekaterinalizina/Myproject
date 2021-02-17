package controlFlow;

import java.sql.SQLOutput;

public class LearnIfElse {
    //Control
    //control flow: Make some decision
    //if (condition){}
    //if condition is true tem it will execute if block and
    //if conditio is false it will execute else block

    //Eclipse: cntrl+shift+f = format code
    //Intellij IDEA: cntr +alt+L =format code in Windows
    //MAC: command +opt+L= format code in MAC -выровнять строки

    public static void main(String[] args) {
        int number =32;
        if (number ==24){
            System.out.println("Number is 24");
        }else {
            System.out.println("Number is not 24");
        }
        int age =56;
        if(age>=18 && age <=21){
            System.out.println("You are Adult but you can not buy Cigarette");
        }else {
            System.out.println("You are not Adul");
        }

        String gender="female";
        if(gender =="female" || age>=50 && number==32){
            System.out.println("you do not have to buy ticket");

        }else {
            System.out.println("You have to buy ticket");
        }
        if (gender=="male" || age>=50 && number==32){
            System.out.println("you don not have to buy ticket");
        }else{
            System.out.println("Male have to buy ticket");
        }


    }
}

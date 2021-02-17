package controlFlow;

import java.util.Scanner;

public class LearnSwitchCase {
    //Switch case
    public static void main(String[] args) {
    //LearnSwitchCase.foodMenu();
        LearnSwitchCase.foodMenu( 7);

    }

    public static void foodMenu(int foodSerial){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your food Serial");

      //  int foodSerial=input.nextInt();
        //int foodSerial=7;
        String foodName;
        switch(foodSerial){
            case 1:
                foodName="Pizza";
                break;
            case 2:
                foodName="Couscous";
                break;
            case 3:
                foodName="Fish";
                break;
            case 4:
                foodName="Meat";
                break;
            case 5:
                foodName="Shirmps";
                break;
            case 6:
                foodName="Lamb";
                break;
            case 7:
                foodName="Desert";
                String desertType="sweet";
                if(desertType =="sweet"){
                    System.out.println("you eat with tea");
                }else if (desertType== "sour"){
                    System.out.println("you need coffee");
                }else {
                    System.out.println("you eat it alone");
                }
                break;
            case 8:
                foodName="Cheese";
                break;
            default:
                foodName="Invalid Food Item";
                break;

        }
        System.out.println("Selected food is"+foodName);
    }
}

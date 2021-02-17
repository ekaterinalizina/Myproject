package controlFlow;

import java.util.Scanner;

public class NestedForLoop {
    //User will give the number  and it will print as a Row Basis
    //output
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number");
        int rowNumber=input.nextInt();
        for (int i=1; i<=rowNumber; i++){
            for(int j=1; j<1; j++){
                System.out.println(j+" ");
            }
            System.out.println();
        }
    }
}

package datastructureandalgorithm.sort;

public class LearnSwap {
    public static void main(String[] args) {
        //Swap - to re-assign value,
        int num1=45;
        int num2=55;
        int temp;
        System.out.println("Number value is "+num1);
        System.out.println("Number value is "+num2);

        temp=num1;
        System.out.println(temp);
        num2=temp;
        num1=temp+num2;
        temp=num1;
        System.out.println(num1);
    }


}

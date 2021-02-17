package datastructureandalgorithm.sort;

public class LearnInsertionSort {
    //insertion sort
    // value of "0" index = 34 will be moved to left and index will be "1" and value of 23 will get index "0"

    public static void main(String[] args) {
        int[] number = {34,45,3,67,87,56,21};
        //output:
        for(int i=0;i<number.length;i++){
            int j=i-1;
            int point = number[i];
            while(j>=0 && number[j]>point){
                number[j+1]=number[j];
                i=j-1;
            }
            number[j+1]=point;
        }
        for(int n=0; n<number.length;n++){
            System.out.println(number[n]+" ");
        }
    }
}

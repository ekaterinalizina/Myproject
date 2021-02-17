package datastructureandalgorithm.sort;

public class LearnBubbleSort {
    //Bubble sort

    public static void main(String[] args) {
        int[] stId={3,56,78,23,5,12,99};
      LearnBubbleSort.bubbleSort(stId);
      for (int i=0;i<stId.length;i++){
          System.out.println(stId[i]+ " ");
      }
        System.out.println();
        System.out.println("After bubble sort");
    }
    public static void bubbleSort(int num[]){
       // int length=num.length;
        int temp=0;
        for(int i=0; i<num.length;i++ ){
            for(int j=1;j<(num.length-i);j++){
                if(num[j-1]>num[j]){
                    //swap
                    temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;
                }
            }
        }
    }
}

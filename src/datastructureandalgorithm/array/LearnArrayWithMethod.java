package datastructureandalgorithm.array;

public class LearnArrayWithMethod {
    public static void main(String[] args) {


        int[] numbers = {23, 34, 65, 12, 7, 102, 87, 46, 343};
        LearnArrayWithMethod.checkMinimum(numbers);
        LearnArrayWithMethod.getArray();
        LearnArrayWithMethod.checkMax(numbers);
    }

    /**
     * this method will check Minimum value from an Array
     * @param num //param = parameter
     * Author: Ekaterina
     */
    static void checkMinimum(int num[]){
        int min =num[0];
        for (int i=0; i<num.length; i++){
            if (min >num[i]){// to find the largest number (min<num[i])
                min=num[i];
            }
        }
        System.out.println(min);
    }

    static void checkMax(int num[]){
        int max =num[0];
        for (int i=0; i<num.length; i++){
            if (max <num[i]){
                max=num[i];
            }
        }
        System.out.println(max);
    }
    static int[] getArray(){
        return new int[]{88, 66, 70,90,23,12,203};
    }

}

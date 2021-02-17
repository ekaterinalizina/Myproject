package datastructureandalgorithm.randomnumber;

import java.util.Random;

public class LearnRandomNumber {
    public static void main(String[] args) {


        int[] stId= new int [10];
        Random random= new Random(30);// seed = start point
        for( int i=0; i<stId.length; i++){
            stId[i]=random.nextInt(400);// bound = limit or End point
            // Random number always generate only whole number
        }
        System.out.println(Math.random());
        System.out.println("NY201"+Math.random());// Lottery number generation

        }
    }


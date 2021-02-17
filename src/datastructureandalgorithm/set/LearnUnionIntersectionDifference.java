package datastructureandalgorithm.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersectionDifference {
    public static void main(String[] args) {
        int num1[]={1, 4,6,12,54,67,49};
        int num2[]={2,6,7,12,54,78,98,34,335};

        Set<Integer> number1=new HashSet<>();
        Set<Integer> number2=new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{1, 4,6,12,54,67,49}));
        number2.addAll(Arrays.asList(new Integer[]{2,6,7,12,54,78,98,34,335}));
        //To do Union Set

        Set<Integer> union=new HashSet<>(number1);
        union.addAll(number2);//= new HashSet<Integer>(number2);

        //to do Intersection = common values insie Arrays when you decided to spend time aloone

        Set<Integer> intersection = new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Intersection of two set"+ intersection);

        //To do Symmetric Diffefence'
        Set<Integer> difference = new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println("Difference of two set "+ difference);


    }
}

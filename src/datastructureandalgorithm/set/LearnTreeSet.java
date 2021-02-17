package datastructureandalgorithm.set;

import java.util.TreeSet;

public class LearnTreeSet {
    // TreeSet is a set where the elements are sorted
    public static void main(String[] args) {
        TreeSet<String>  iphoneModel= new TreeSet<>();
        iphoneModel.add("12 Pro Max");
        iphoneModel.add("12 Pro");
        iphoneModel.add("11 Pro Max");
        iphoneModel.add("11 Pro");
        iphoneModel.add("10");
        System.out.println(iphoneModel);

        iphoneModel.remove("11");
        System.out.println(iphoneModel);
        iphoneModel.pollFirst();//first value will remove
        System.out.println(iphoneModel);
        iphoneModel.pollLast();
        System.out.println("After pollast "+ iphoneModel);
        System.out.println(iphoneModel.contains("12 Pro Max"));
    }
}

package datastructureandalgorithm.arrayList;

import datastructureandalgorithm.array.LearnArray;

import java.util.ArrayList;

public class LearnArrayList {
    //No need to declare Array size / dynamic Array
    //When we create List we don't need to use index, we don't need to tell dimensions

    //ArrayList type

    ArrayList <String>studentAddress = new ArrayList<String>(); // Diamond braces, inside declare DataType>> Name
    // object creation of ArrayList

    public static ArrayList<Integer> studentMobileNumber= new ArrayList<Integer>();
    // Integer - final wrapper class

    public static void main(String[] args) {
        // Assign value

        LearnArrayList learn = new LearnArrayList();
        learn.studentAddress.add("Manhattan, NY");//index 0
        learn.studentAddress.add("Quenns, NY");
        learn.studentAddress.add("Jamaica, NY");//index 2
        learn.studentAddress.add("Albany, NY");
        learn.studentAddress.add("Bronx, NY");
        learn.studentAddress.add("Brooklyn, NY");
        learn.studentAddress.add("Jersey City, NJ");//index 6

        System.out.println(learn.studentAddress.get(2));// because index starts from '0'
        System.out.println(learn.studentAddress.size());// it will show in console '7', because there are 7 lines=fieldes
        // the count starts from '0'

        //How to Retrieve all the value from Array List

        for(String st: learn.studentAddress){
            System.out.println("Student address "+st);
        }


        for(String st: learn.studentAddress){
            System.out.println("Student adress "+st);
        }
        System.out.println(" *********add value**************");
        learn.studentAddress.add("Denver, CO");
        System.out.println("********* remove value**********");
        learn.studentAddress.remove("Albany,NY");

        String [] stName = new String[5000];
        stName[0]="James";
        stName[1]="Jack";
        stName[2]="Bob";

        ArrayList <String> names = new ArrayList<String>();
        System.out.println(names.size());
        ArrayList name= new ArrayList();// Do we need this line
        name.add("Maria");
        name.add("Easha");
        name.add("Mark");
        name.add("Peter");
        System.out.println("names ");


        //Wrapper class:
        //Integer : int
        //Byte : byte
        //Short : short
        //Double : double

        // remove method- to remove value








    }




}

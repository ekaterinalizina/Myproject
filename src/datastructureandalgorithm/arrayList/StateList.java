package datastructureandalgorithm.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList {
    public static void main(String[] args) {

        //2 options to create list Interface
        List<String> stateNameList = new LinkedList<>();// faster then ArrayList
        List<String> stateNameList1 = new ArrayList<>();

        stateNameList.add("NY");
        stateNameList.add("NJ");
        stateNameList.add("CA");
        stateNameList.add("PA");
        stateNameList.add("WI");
        stateNameList.add("FL");
        stateNameList.add("DC");
        stateNameList.add("IL");
        stateNameList.add("CO");
        stateNameList.add("MI");


        // How to retrieve all the value

        //       for(String st: stateNameList){
        //           System.out.println("states name"+st);
        //      }

        System.out.println("************* Before remove");
        Iterator it = stateNameList.iterator();// we want to check value one by one, like loop// it - any Variable name
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("***********after Remove");
        stateNameList.remove("MI");
        Iterator ite = stateNameList.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());


        }
    }
}

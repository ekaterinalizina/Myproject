package datastructureandalgorithm.map;

import java.util.*;

public class LearnListHashMap {
    public static void main(String[] args) {
        List<String> stateNameOfUSA= new LinkedList<>();// or ArrayList
        stateNameOfUSA.add("NY");
        stateNameOfUSA.add("NY");
        stateNameOfUSA.add("NJ");
        stateNameOfUSA.add("CA");
        stateNameOfUSA.add("PA");
        stateNameOfUSA.add("WI");
        stateNameOfUSA.add("FL");
        stateNameOfUSA.add("DC");
        stateNameOfUSA.add("IL");
        stateNameOfUSA.add("CO");
        stateNameOfUSA.add("MI");

        List<String> stateNameOfCANADA= new ArrayList<>();
        stateNameOfCANADA.add("Toronto");
        stateNameOfCANADA.add("Ontario");
        stateNameOfCANADA.add("Montreal");
        stateNameOfCANADA.add("Quebec");
        stateNameOfCANADA.add("Ottawa");

        List<String> stateNameOFNepal= new ArrayList<>();
        stateNameOFNepal.add("Kathmandu");
        stateNameOFNepal.add("Mustang");
        stateNameOFNepal.add("Pokhara");
        stateNameOFNepal.add("Lalitpur");
        stateNameOFNepal.add("Jhapa");


//      Now we will create a map and add info
        Map<String,List<String>> stMap= new HashMap<>();
        stMap.put("USA",stateNameOfUSA);// USA - is our Key
        stMap.put("CANADA",stateNameOfCANADA);//Canada - is our Key
        stMap.put("Nepal",stateNameOFNepal);// Nepal - is our Key


        for(Map.Entry<String,List<String>> entry: stMap.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }

}

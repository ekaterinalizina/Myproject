package datastructureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    //Map: <key,value>
    //when we call a key, we get a value
    //when we search data in an Array
    //to get value we need to convert it >> keySet and values() >> it comes from Collection
    //Collection is a father of each Interface
    //There is entrySet();
    //#map HashMap

    String name = "James";

    public static void main(String[] args) {
        Map<String,String>stateMap=new HashMap<>();//we use Hashmap because is a class extends AbstrMap and implements
        // Map
        stateMap.put("USA","NY");// USA - KeyValue, NY - ValueValue
        stateMap.put("Canada","ON");
        stateMap.put("Armenia","Yerevan");
        stateMap.put("Nepal","KTM");
        stateMap.put("Algeria","Algeria");
        stateMap.put("Tokyo","Japan");

        System.out.println(stateMap.get("Nepal"));


        // How to retrieve all the value from map (For Each loop approach)?

        for(Map.Entry<String, String> entry: stateMap.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
        // Another approach:
        System.out.println("********** Alternative Approach");
        for(String st: stateMap.keySet()){
            System.out.println(st+" : "+ stateMap.get(st));
        }

    }


}

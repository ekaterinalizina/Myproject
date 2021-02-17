package datastructureandalgorithm.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    //Set is an interface which extends colldection. it is an un order collection of objects in which
    // duplicate values can not be stored
    //set is implemented by HashSet, LinkedHashSet of UseTreeSet
    //a set is a set of values which is not allowed duplicate elements.
    // Its a parent interface of all set classes like Treset, HashSet.
    //A hashSet is set where elements are not sorted or ordered. it is faster that a TreeSet

    public static void main(String[] args) {
        Set<String> mobileBrand=new HashSet<String>();
        mobileBrand.add("Iphone");
        mobileBrand.add("google");
        mobileBrand.add("Nokia");
        mobileBrand.add("samsung");
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.remove("Nokia"));
        System.out.println("After remove "+mobileBrand);

    }

}

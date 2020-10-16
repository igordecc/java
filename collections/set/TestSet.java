package collections.set;

import java.util.Set;
import java.util.*;
import java.util.HashSet;

// test java.utils.Set methods
public class TestSet {
    public static void main(String[] args) {
        Set<String> testSetOne = new HashSet<String>();
        // add one element
        testSetOne.add("one");
        // add sevral elements
        String[] a = {"two", "three", "four"};
        testSetOne.addAll(Arrays.asList(a));
        // if element exist remove element
        if (testSetOne.contains("four")) {
            testSetOne.remove("four");
        }
        // printout size of the set
        System.out.println(testSetOne.size());
    }
}   
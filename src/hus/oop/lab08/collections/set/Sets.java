package hus.oop.lab08.collections.set;

import java.util.*;
public class Sets {
    /**
     * Function returning the intersection of two given sets
     * (without using library functions)
     */
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>();
        for (int number : first) {
            if (second.contains(number)) {
                intersectionSet.add(number);
            }
        }
        return intersectionSet;
    }

    /**
     * Function returning the union of two given sets
     * (without using library functions)
     */
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>();
        for (int number : first) {
            unionSet.add(number);
        }

        for (int number : second) {
            unionSet.add(number);
        }

        return unionSet;
    }

    /**
     * Function returning the intersection of two given sets (see reatinAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>();
        return intersectionSet;
    }
}

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
     * Function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    /**
     * Function returning the union of two given sets
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(first);
        unionSet.addAll(second);
        return unionSet;
    }

    /**
     * Function to transform a set into a list without duplicates
     * Note well: collections can be created from another collection!
     * @param source set
     * @return a linked list
     */
    public static List<Integer> toList(Set<Integer> source) {
        return new LinkedList<>(source);
    }

    /**
     * Function to remove duplicates from a list
     * without using the constructors trick seen above
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>(source);
        return new LinkedList<>(set);
    }

    /**
     * Function to remove duplicates from a list
     * without using the constructors trick seen above
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        Set<Integer> set = new HashSet<>();
        set.addAll(source);

        List<Integer> res = new LinkedList<>();
        res.addAll(set);

        return res;
    }

    /**
     * Function accepting a string s
     * returning the first recurring character
     * For example firstRecurringCharacter("abaco") -> a.
     */
    public static String firstRecurringCharacter(String s) {

    }
}

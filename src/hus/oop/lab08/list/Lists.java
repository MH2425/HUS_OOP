package hus.oop.lab08.list;

import java.util.*;
public class Lists {
    /**
     * Function to insert an element into a list at the beginning
     */
    public static void insertFirst(List<Integer> list, int value) {
        if (list.isEmpty()) {
            list.add(value);
        } else {
            list.add(0, value);
        }
    }

    /**
     * Function to insert an element into a list at the end
     */
    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    /**
     * Function to replace the 3rd element of a list with a given value
     */
    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }

    /**
     * Function to remove the 3rd element from a list
     * @param list given list
     */
    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }

    /**
     * Function to remove the element "666' from a list
     */
    public static void removeEvil(List<Integer> list) {
        list.remove(666);
    }

    /**
     * Function returning a List<Integer> containing
     * the first 10 square numbers (i.e., 1, 4, 9, 16, ...)
     */
    public static List<Integer> generateSquare() {
        List<Integer> list = new LinkedList<>();
        for (int number = 1; number <= 10; number++) {
            list.add(number * number);
        }
        return list;
    }

    /**
     * Function to verify ìf a list contains a certain value
     */
    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    /**
     * Function to copy a list into another list (without using library functions)
     * Note well: the target list must be emptied before the copy
     */
    public static void copy(List<Integer> source, List<Integer> target) {
        for (Integer integer : source) {
            target.add(integer);
        }
    }

    /**
     * Function to reverse the elements of a list
     */
    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    /**
     * Function to reverse the elements of a list (without using library functions)
     */
    public static void reverseManual(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for (int idx = list.size() - 1; idx >= 0; idx--) {
            temp.add(list.get(idx));
        }

        for (Integer integer : temp) {
            list.add(integer);
        }
    }

    /**
     * Function to insert the same element both at the
     * beginning and the end of the same LinkedList
     * Note well: you can use LinkedList specific methods
     */
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.add(0, value);
        list.add(value);
    }
}

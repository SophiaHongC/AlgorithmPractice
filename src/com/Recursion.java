package com;


import java.util.List;

public class Recursion {

    static public boolean LinearSearch(List<Integer> list, Integer target) {

        //basic step
        if (list.size() == 1) {
            return list.get(0).equals(target);
        }


        int center = list.size() / 2;
        List<Integer> left = list.subList(0, center);
        List<Integer> right = list.subList(center, list.size());

        boolean b1 = LinearSearch(left, target);
        boolean b2 = LinearSearch(right, target);

        return b1 || b2;

    }
}

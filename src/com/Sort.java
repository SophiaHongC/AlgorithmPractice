package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    static public int[] InsertionSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        } else {
            for (int i = 1; i < arr.length; i++) {
                int v1 = arr[i];
                int index = i - 1;
                while (index >= 0 && v1 < arr[index]) {
                    arr[index + 1] = arr[index];
                    index--;
                }
                arr[index + 1] = v1;
            }
        }
        return arr;

    }


    static public int[] InsertionSortDesc(int[] arr) {
        if (arr.length == 1) {
            return arr;
        } else {
            for (int i = 1; i < arr.length; i++) {
                int v1 = arr[i];
                int index = i - 1;
                while (index >= 0 && v1 > arr[index]) {
                    arr[index + 1] = arr[index];
                    index--;
                }
                arr[index + 1] = v1;
            }

            return arr;
        }
    }


    static public int[] ChooseSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int maxIndex = 0;
            for (int a = 0; a < arr.length + 1 - i; a++) {
                if (arr[a] > arr[maxIndex]) {
                    maxIndex = a;
                }
            }
            int cache = arr[arr.length - i];
            arr[arr.length - i] = arr[maxIndex];
            arr[maxIndex] = cache;
        }

        return arr;
    }


    static public List<Integer> MergeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return MergeSort(list);
    }

    private static List<Integer> MergeSort(List<Integer> list) {
        if (list.size() <= 2) {
            Collections.sort(list);
            return list;
        }
        int center = list.size() / 2;
        List<Integer> left = MergeSort(list.subList(0, center));
        List<Integer> right = MergeSort(list.subList(center, list.size()));
        return Merge(left, right);
    }

    public static List<Integer> Merge(List<Integer> left, List<Integer> right) {
        List<Integer> list = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) > right.get(rightIndex)) {
                list.add(right.get(rightIndex++));
            } else {
                list.add(left.get(leftIndex++));
            }
        }

        if (leftIndex == left.size()) {
            list.addAll(right.subList(rightIndex, right.size()));
        } else {
            list.addAll(left.subList(leftIndex, left.size()));
        }

        return list;


    }




}

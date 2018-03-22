package com;

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
}

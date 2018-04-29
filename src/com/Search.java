package com;

public class Search {
    /**
     * 二分查找
     * (仅为练习算法，泛型什么的语法特性都不管了)
     *
     * @param arr
     * @param target
     */
    static public int BinarySearch(int[] arr, int target) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;


        while (leftIndex <= rightIndex) {
            int centerIndex = (leftIndex + rightIndex) / 2;
            int value = arr[centerIndex];
            if (value == target) {
                return centerIndex;
            } else if (value < target) {
                leftIndex = centerIndex + 1;
            } else if (value > target) {
                rightIndex = centerIndex - 1;
            }
        }

        return -1;
    }


//    /**
//     * 查找两个有序数组的中位数
//     * @param arr1
//     * @param arr2
//     * @return
//     */
//    static public int findMedian(int[] arr1,int[] arr2){
//
//
//
//    }

    static public int LinearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;

    }

}

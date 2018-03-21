package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
//        System.out.println(com.PrimeAlgorithm.isPrime(289));
        //com.SieveofEratosthenes.findPrimes(1000000).forEach(System.out::println);
//        System.out.println(com.SieveofEratosthenes.findPrimes(100).size());
        //System.out.println(com.PrimeAlgorithm.Factorization(1248242388888L));
//        for(int i=1;i<100;i++){
//            System.out.println(Math.pow(i,4)%10);
//        }
        //System.out.println(com.PrimeAlgorithm.MinimumCommonMultiple((long)(pow(2,3)*pow(3,5)*pow(7,2)),(long)(pow(2,4)*pow(3,3))));

        //System.out.println(RadixConversion("22", 10, 2));

        //System.out.println(com.BinaryOperation.BinaryAdd("10111","1010"));

        //System.out.println(com.ModularArithmetic.IsDivideExactly(123,3));

        //System.out.println(10000000%11);

        //System.out.println(com.PrimeAlgorithm.EuclideanAlgorithm(36,24));
//        for(int i=0;i<100;i++)
//        {
//            System.out.println((int)(com.ModularArithmetic.Random()*10000));
//        }

//        int[] arr=new int[]{1,2,54,252,321,423,562};
//        int i = com.Search.BinarySearch(arr, 423);
//        System.out.println(i);

        //System.out.println(com.Common.Factorial(4));
        //System.out.println(C(4,2));

        System.out.println(Arrays.toString(Sort.InsertionSortDesc(new int[]{3,521,23,22,4523,21,532,321,252,42})));

    }


    /**
     * 进制转换(1-16之间)
     *
     * @param origin      原始数
     * @param originRadix 原始进制
     * @param targetRadix 目标进制
     * @return
     */
    public static String RadixConversion(String origin, int originRadix, int targetRadix) {

        //先转换到十进制
        int cache = 0;
        for (int i = 0; i < origin.length(); i++) {
            //获取对应位数的数字
            int a;
            char c = origin.charAt(i);
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                a = 10 + Integer.parseInt((char) (Character.toLowerCase(c) - 49) + "");
            } else {
                a = Integer.parseInt(origin.charAt(i) + "");
            }
            cache += a * Math.pow(originRadix, origin.length() - i - 1);

        }
        //转换到目标进制
        ArrayList<String> list = new ArrayList<>();
        int remainder;
        int division = -1;
        while (division != 0) {
            remainder = cache % targetRadix;
            division = (cache - remainder) / targetRadix;
            cache = division;
            list.add(remainder + "");
        }

        Collections.reverse(list);
        return list.stream().reduce("", (a, b) -> a + b);
    }

}

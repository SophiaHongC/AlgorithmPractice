package com;

public class PermutationAndCombination {

    /**
     * 求P(a,b) a>=b
     * @param a
     * @param b
     * @return
     */
    static public long Permutation(long a,long b){
        if(a<b){
            return -1;
        }
        //return com.Common.Factorial(a)/com.Common.Factorial(a-b);
        long value=1;
        long c=a-b+1;
        while(a>=c){
            value*=a;
            a--;
        }

        return value;
    }

    /**
     * 排列的简写
     * @param a
     * @param b
     * @return
     */
    static public long P(long a,long b){
       return Permutation(a,b);
    }


    /**
     * 组合的简写
     * @param a
     * @param b
     * @return
     */
    static public long C(long a,long b){
        return  Combination(a,b);
    }


    /**
     * 求C(a,b) a>=b
     * @param a
     * @param b
     * @return
     */
    static public long Combination(long a,long b){
        if(a<b){
            return -1;
        }
        return Permutation(a,b)/Permutation(b,b);
    }






}

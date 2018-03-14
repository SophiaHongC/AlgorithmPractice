package com;

import java.util.Date;

public class ModularArithmetic {

    private static int key=123214;

    /**
     * 求两者和的模，适用于直接相加会溢出的情况
     *
     * @param num1
     * @param num2
     * @param mod
     */
    static public long AddModular(long num1, long num2, long mod) {
        return ((num1 % mod) + (num2 % mod)) % mod;
    }

    /**
     * 求两者积的模，适用于直接相乘会溢出的情况
     *
     * @param num1
     * @param num2
     * @param mod
     */
    static public long MultipleModular(long num1, long num2, long mod) {
        return ((num1 % mod) * (num2 % mod)) % mod;
    }

    /**
     * 判断两者是否同余
     *
     * @param num1
     * @param num2
     * @param mod
     * @return
     */
    static public boolean isCongruence(long num1, long num2, long mod) {
        return (num1 - num1) % mod == 0;
    }


    /**
     * 判断是否整除，使用多种优化算法
     *
     * @param dividend
     * @param divisor
     */
    static public boolean IsDivideExactly(long dividend, long divisor) {
        //除数是3时的优化，判断各位和是否能整除3
        if (divisor == 3) {
            String s = Long.toString(dividend);
            int a = 0;
            for (int i = 0; i < s.length(); i++) {
                a += Integer.parseInt(s.charAt(i) + "");
            }
            return a % 3 == 0;
        }
        //判断尾数是否是偶数
        else if (divisor == 2) {
            String s = Long.toString(dividend);
            int a = Integer.parseInt(s.charAt(s.length() - 1) + "");
            return a % 2 == 0;
        }
        //判断尾数是否是5或0
        else if (divisor == 5) {
            String s = Long.toString(dividend);
            int a = Integer.parseInt(s.charAt(s.length() - 1) + "");
            return a == 5 || a == 0;
        }
        else {
            //无优化
            return dividend % divisor == 0;
        }
    }

    /**
     * 使用线性同余法生成随机数(0-1)
     */
    static public float Random(){
        return (float) ((key++*3359+7307)%9857/9857.0);
    }



}

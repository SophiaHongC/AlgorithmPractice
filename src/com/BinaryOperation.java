package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryOperation {
    /**
     * 相加任意长的二进制位串
     *
     * @param b1
     * @param b2
     * @return
     */
    static public String BinaryAdd(String b1, String b2) {
        //先将两个位串对齐，少的部分前面加上0补
        if (b1.length() > b2.length()) {
            b2 = Common.repeatString("0", (b1.length() - b2.length())) + b2;
        } else {
            b1 = Common.repeatString("0", (b2.length() - b1.length())) + b1;
        }
        List<String> list = new ArrayList<>();
        int jinwei = 0;
        for (int i = b1.length() - 1; i >= 0; i--) {
            int v1 = Integer.parseInt(b1.charAt(i) + "");
            int v2 = Integer.parseInt(b2.charAt(i) + "");

            int yushu = (v1 + v2 + jinwei) % 2;
            list.add(yushu + "");
            jinwei = ((v1 + v2 + jinwei) - yushu) / 2;

        }
        if (jinwei != 0) {
            list.add(jinwei + "");
        }

        Collections.reverse(list);

        return list.stream().reduce("", (a, b) -> a + b);
    }


}

package com;

public class Common {
    static public String repeatString(String str, int times){
        StringBuffer buffer=new StringBuffer();
        for(int i=0;i<times;i++){
            buffer.append(str);
        }
        return buffer.toString();
    }

    /**
     * 阶乘
     * @return
     */
    static public long Factorial(long a){
        if(a<=1){
            return 1;
        }
        else{
            return a*Factorial(a-1);
        }
    }
}

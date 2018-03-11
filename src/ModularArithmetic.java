public class ModularArithmetic {

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

}

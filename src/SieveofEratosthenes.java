import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SieveofEratosthenes {
    /**
     * 返回小于等于max的所有素数
     * (算法:埃拉托斯特尼筛法)
     *  该算法的分析见我博客
     * @param max
     * @return
     */
    static List<Integer> findPrimes(int max) {

        List<Integer> list = new ArrayList<>();
        //为了保持索引值与数值一致，看上去更清晰，先加一个0
        list.add(0);
        for (int i = 1; i <= max; i++) {
            list.add(i);
        }
        //1不是素数，去掉
        list.set(1, 0);

        int s = (int) Math.sqrt(max);
        //遍历小于sqrt(max)的数
        for (int i = 2; i <= s; i++) {
            //先判断是不是素数
            if (list.get(i) != 0) {
                //这里直接忽略了小于i的倍数，因为之前肯定已经出现过了。(这个优化很多别的地方都没有看到)
                int a = i * i;
                while (a <= max) {
                    list.set(a, 0);
                    a += i;
                }
            }
        }

        return list.stream().filter(i -> i != 0).collect(Collectors.toList());
    }
}

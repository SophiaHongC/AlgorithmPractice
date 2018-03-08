import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(289));
        SieveofEratosthenes.findPrimes(100).forEach(System.out::println);
        System.out.println(SieveofEratosthenes.findPrimes(100).size());
    }

    /**
     * 判断一个数是不是素数
     *
     * @return
     */
    static boolean isPrime(int num) {
        int a = (int) Math.sqrt(num);
        //还是使用埃拉托斯特尼筛法获取小于sqrt(x)的所有素数
        List<Integer> primes=SieveofEratosthenes.findPrimes(a);
        for (Integer prime : primes) {
            if (num % prime == 0) {
                return false;
            }
        }
        return true;
    }



}

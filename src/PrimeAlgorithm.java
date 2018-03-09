import java.util.ArrayList;
import java.util.List;

public class PrimeAlgorithm {
    /**
     * 判断一个数是不是素数
     *
     * @return
     */
    static boolean isPrime(int num) {
        int a = (int) Math.sqrt(num);
        //还是使用埃拉托斯特尼筛法获取小于sqrt(x)的所有素数
        List<Long> primes=SieveofEratosthenes.findPrimes(a);
        for (Long prime : primes) {
            if (num % prime == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * 返回数的因式分解式，例如8，则返回{2,2,3}
     * 如果是一个素数，返回1和他自己
     *算法:试除法
     * @return
     */
    static List<Long> Factorization(long num) {
        List<Long> results=new ArrayList<>();

        int a = (int) Math.sqrt(num);
        //还是使用埃拉托斯特尼筛法获取小于sqrt(x)的所有素数
        List<Long> primes=SieveofEratosthenes.findPrimes(a);
       //循环除，直到num是一个素数
        while(true)
        {
            boolean isPrime=true;
            //除数
            Long div;
            for(int i=0;i<primes.size();i++){
                div=primes.get(i);
                if(num%div==0){
                    num/=div;
                    results.add(div);
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                if(num!=1){
                    results.add(num);
                }
                if(results.size()==1){
                    results.add(0,1L);
                }
                break;
            }
            //为了提高效率，这里把primes的最大值限制在sqrt(num)以下
            //从后往前，删除掉大于sqrt(num)的数
            int ss= (int) Math.sqrt(num);
            for(int i=primes.size()-1;i>=0;i--){
                if(primes.get(i)>ss){
                    primes.remove(i);
                }
            }

        }


        return results;
    }
}

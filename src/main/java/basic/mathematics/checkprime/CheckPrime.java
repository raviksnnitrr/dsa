package basic.mathematics.checkprime;

public class CheckPrime {

    public static void main(String[] args){
        System.out.println(isPrime(2));
        System.out.println(isPrime(15));
        System.out.println(isPrime(449));

        System.out.println(isPrimeOptimized(2));
        System.out.println(isPrimeOptimized(15));
        System.out.println(isPrimeOptimized(449));
    }

    /**
     * Naive Approach
     * Here we will iterate from 2 to n and check whether n is divisible by any number then it won't be prime else it will be prime
     * T.C: O(N)
     * S.C: O(1)
     * @param n
     * @return
     */
    static boolean isPrime(int n){
        if(n == 1)
            return false;
        for(int i = 2; i < n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * This solution is based on the fact that divisor appears in pairs, so if n has a divisor greater than sqrt(n) then
     * corresponding pair must have been in less than sqrt(n)
     * T.C: O(sqrt(n))
     * S.C: O(1)
     * @param n
     * @return
     */
    public static boolean isPrimeOptimized(int n){
        if(n == 1)
            return false;
        if(n == 2 || n == 3)
            return true;
        if(n % 2 == 0 || n % 3 == 0)
            return false;

        for(int i = 5; i*i <= n; i++){
            if(n % i == 0 || n%(i+2) == 0)
                return false;
        }
        return true;
    }
}

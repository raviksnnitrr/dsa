package basic.mathematics.primefactors;

public class PrimeFactors {

    public static void main(String[] args){
        printAllPrimeFactors(15);
        printAllPrimeFactors(1);
        printAllPrimeFactors(2);
        printAllPrimeFactors(449);
        printAllPrimeFactors(16);
    }

    /**
     * This uses similar fact that divisor appears in pairs so we are finding the prime factor for n and
     * then subsequently dividing it to get next smaller number and finding factor for that
     * T.C: O(sqrt(n)loglogn) but it will be less than that as the iteration is quite less here
     * @param n
     */
    static void printAllPrimeFactors(int n){
        if(n == 1)
            return;
        if(n % 2 == 0){
            while(n%2 == 0){
                System.out.print(2 + " ");
                n = n/2;
            }
        }
        if(n % 3 == 0){
            while(n%3 == 0){
                System.out.print(3 + " ");
                n = n/3;
            }
        }

        for(int i = 5; i*i <= n; i = i+6){
            if(n % i == 0){
                while(n%i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
            if(n % (i+2) == 0){
                while(n%(i+2) == 0) {
                    System.out.print((i+2) + " ");
                    n = n / (i+2);
                }
            }
        }
        if(n > 3)
            System.out.println(n + " ");
    }
}

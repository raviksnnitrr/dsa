package basic.mathematics.sieve;

import basic.mathematics.checkprime.CheckPrime;

import java.util.Arrays;

public class PrintAllPrimeNos {
    public static void main(String[] args){
        printAllPrimeNosTillN(10);
        System.out.println();
        printAllPrimeNosTillN(450);
    }

    static void printAllPrimeNosTillN(int n){
        if(n <= 1)
            return;
        boolean[] sieve = new boolean[n+1];
        Arrays.fill(sieve, true);
        for(int i = 2; i <= n ; i++){
            if(sieve[i] && CheckPrime.isPrimeOptimized(i)){
                System.out.print(i + " ");
                for(int j = i*i; j <= n; j= j+i){
                    sieve[j] = false;
                }
            }
        }
    }
}

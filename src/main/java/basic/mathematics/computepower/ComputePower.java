package basic.mathematics.computepower;

public class ComputePower {

    public static void main(String[] args){
        System.out.println(computePower(4,4));
        System.out.println(computePower(6,3));
    }

    /**
     * For computing x^n we can compute x^(n/2) and then multiply the result to get actual result
     * If n is even then above will be result
     * If n is odd then final result will be result*x
     * T.C: O(log(n))
     * S.C; O(1)
     * @param x
     * @param n
     * @return
     */
    static long computePower(int x, int n){
        if(n == 0)
            return 1;
        if(n == 1)
            return x;
        long temp = computePower(x, n/2);
        temp = temp*temp;
        if(n%2 == 0){
            return temp;
        }else{
            return temp*x;
        }
    }
}

package basic.mathematics.divisors;

public class PrintAllDivisors {

    public static void main(String[] args){
        printAllDivisors(449);
        printAllDivisors(16);
    }

    /**
     * It uses the same concept of divisors appear in pairs, here first we are iterating till sqrt(n) to find first divisor
     * then for second pair we are iterating from sqrt(n) to 1 and second divisor will be n/i
     * T.C: O(sqrt(n))
     * S.C: O(1)
     * @param n
     */
    static void printAllDivisors(int n){
        int i = 1;
        for(i = 1; i*i <= n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
        for(; i >= 1; i--){
            if(n % i == 0){
                System.out.print(n/i + " ");
            }
        }
        System.out.println();
    }
}

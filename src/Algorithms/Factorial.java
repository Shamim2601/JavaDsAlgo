package Algorithms;

public class Factorial {
    public static void main(String[] args) {
        int n = 6;

        // n! = 5! = 5*4*3*2*1

        int even_sum = sum_finder(n);
        // 6+4+2+0

        System.out.println(even_sum);
    }

    // sf(6)
    // 6+sf(5)
    // 6+sf(4)
    // 6+4+sf(3)
    // 6+4+sf(2)
    // 6+4+2+sf(1)
    // 6+4+2+sf(0)
    // 6+4+2+0

    private static int sum_finder(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return n + sum_finder(n - 1);
        } else {
            return sum_finder(n - 1);
        }
    }

    private static int fact_finder(int n) {
        if(n==1) return 1;

        return n*fact_finder(n-1);

        // 5*ff(4)
        // 5*4*ff(3)
        // 5*4*3*ff(2)
        // 5*4*3*2*ff(1)
        // 5*4*3*2*1
    }
}

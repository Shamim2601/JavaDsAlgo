package Misc;

public class LcmGcd {

    // Method to calculate the least common multiple (LCM) of three numbers
    public static int lcm(int n1, int n2, int n3) {
        int max = Math.max(n1, Math.max(n2, n3));
        int maxval = max; // 6
        while (true) {
            if (max % n1 == 0 && max % n2 == 0 && max % n3 == 0) {
                return max;
            }
            max+= maxval; // 12, 18, 24, 30
        }
    }

    public static int gcd(int n1, int n2) {
        int min = Math.min(n1, n2);
        int gcdval = min;

        // gcd(12,30): 1, 2, 3, 6=> 6
        for(int i=min;i>0;i=i-1){
            if(n1%i==0 && n2%i==0){
                gcdval= i;
                break;
            }
        }
        return gcdval;
    }

    public static int gcdEuclidean(int n1, int n2) {
        int divider = Math.min(n1, n2);  // 12 , 6, 0
        int dividend = Math.max(n1,n2);  // 30 , 12, 6

        if(divider==0) return dividend;  // 6

        // gcd(12,30):
        // 12)30(2  step-1
        //    24
        //    6
        //    6)12(2  step-2
        //      12
        //       0
        //       0)6(   divider=0 => dividend = 6 = gcd

        int remainder = dividend % divider;  // 6 , 0
        return gcdEuclidean(remainder, divider);  // (6,12), (0,6)
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 8;
        int num3 = 6;

        int result = lcm(num1, num2, num3);
        System.out.println("LCM of " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);

        num1 = 12;
        num2 = 30;
        System.out.println("Gcd of "+num1+" and "+ num2+" = "+gcdEuclidean(num1,num2));
    }
}

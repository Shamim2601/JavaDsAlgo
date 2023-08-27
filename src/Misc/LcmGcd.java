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
        int max = Math.max(n1, n2);

        return max;
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 8;
        int num3 = 6;

        int result = lcm(num1, num2, num3);
        System.out.println("LCM of " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);

        System.out.println("Gcd of "+num1+" and "+ num2+" = "+gcd(num1,num2));
    }
}

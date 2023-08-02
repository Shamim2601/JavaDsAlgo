package Algorithms;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while(true){
            System.out.print("enter number[-1 to exit]: ");
            n = scanner.nextInt();
            // prime: only divisible by 1 and itself(e.g. 7, 13, 31)
            // composite: divisible by other numbers along with 1 and itself

            if(n==-1) System.exit(0);

            for(int i=2;i<n;i++){
                System.out.println("n = "+n+"\ti = "+i);
                if(n%i==0){
                    System.out.println("Composite");
                    break;
                }

                if(i==n-1){
                    System.out.println("prime");
                }
            }
        }

    }
}

package Misc;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while(true){
            System.out.print("Enter number[-1 to exit]: ");
            n = scanner.nextInt();
            if(n==-1){
                System.out.println("Thanks for using system!");
                System.exit(0);
            }

            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("Not prime");
                    break;
                }

                if(i==n-1){
                    System.out.println("Prime");
                }
            }
        }
    }
}

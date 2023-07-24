package Misc;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N;

        while(true){
            System.out.print("ENter N[0 to exit]: ");
            N = scanner.nextInt();
            if(N<1) break;
            int f1 = 1;
            int f2 = 1;
            int tmp;
            System.out.println(f1);
            while(f2<N){
                System.out.println(f2);
                tmp = f1;
                f1 = f2;
                f2 = tmp+f2;
            }
        }
    }
}

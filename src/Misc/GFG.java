/*package whatever //do not write package name here */
import java.io.*;

class GFG {
    public static int fibonacci_numbers(int n)
    {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibonacci_numbers(n-2) + fibonacci_numbers(n-1);
        }
    }
    public static void main (String[] args) {
        int n = 7;
        for(int i = 0; i < n; i++){
            System.out.print(fibonacci_numbers(i)+ " ");
        }
    }
}

// This code is contributed by Rupesh Kapse

package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BSearchAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {39,4,39,37,38,59,80,27,49,90,12};
        Arrays.sort(numbers); // must be sorted for binary search
        // numbers = [4, 12, 27, 37, 38, 39,49, 59, 80, 90]
        int n =  numbers.length;

        System.out.print("Enter search key: ");
        int key = scanner.nextInt();

        int low = 0;
        int high = n-1;
        int mid;
        int count = 0;

        while(true){
            mid = (low + high)/2;
            count++;
            if(low > high){
                System.out.println("Not present");
                System.out.println("count = "+ count);
                break;
            }

            if(key == numbers[mid]){
                System.out.println("Found at index " + mid);
                System.out.println("count = "+ count);
                break;
            }else if(key < numbers[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        // number of attempts = log2(n)
        // time complexity = O(logn)
    }
}

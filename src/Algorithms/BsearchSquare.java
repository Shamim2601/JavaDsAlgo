package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BsearchSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int[] numbers = {39,4,39,37,38,59,80,27,49,90,12};
        //Arrays.sort(numbers); // must be sorted for binary search
        // numbers = [4, 12, 27, 37, 38, 39,49, 59, 80, 90]

        int[] sqNums = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        int n =  sqNums.length;

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

            if(key*key == sqNums[mid]){
                System.out.println("Found at index " + mid);
                System.out.println("count = "+ count);
                break;
            }else if(key*key < sqNums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        // number of attempts = log2(n)
        // time complexity = O(logn)
    }
}

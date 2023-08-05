package Algorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter magic number: ");
        int magicNumber = scanner.nextInt();
        int low = 1;
        int high = 100;
        int mid;
        int count = 0;

        while(true){
            mid = (low + high)/2;
            count++;

            if(mid == magicNumber){
                System.out.println("Program needed "+count+" attempts");
                break;
            }else if(mid < magicNumber){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
    }
}

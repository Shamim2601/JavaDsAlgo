package Algorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter size: ");
        int n = scanner.nextInt();
        String[] fruits = new String[n];

        fruits[0] = "mango";
        fruits[1] = "cherry";
        fruits[2] = "apple";
        fruits[n-2] = "banana";
        fruits[n-1] = "strawberry";

        System.out.print("enter fruit name to search: ");
        String fruit = scanner.next();

        for(int i=0;i<fruits.length;i++){
            if(fruits[i]==null) continue;
            if(fruits[i].equalsIgnoreCase(fruit)){
                System.out.println("found at position: "+ i);
                break;
            }

            if(i== fruits.length-1){
                System.out.println("not found");
            }
        }
    }
}

// time complexity: B + Cn => O(n)
// space complexity: n sized array => O(n)

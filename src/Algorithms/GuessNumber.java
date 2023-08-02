package Algorithms;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magicNumber = 3;
        int count = 0;

        int guess;
        while(true){
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            count++;

            if(guess==magicNumber){
                System.out.println("You have guessed it right after "+count+ " attempts");
                break;
            }else if(guess<magicNumber){
                System.out.println("Guess higher");
            }else{
                System.out.println("Guess lower");
            }
        }

        System.out.println("Thank you! Play again...");
    }
}

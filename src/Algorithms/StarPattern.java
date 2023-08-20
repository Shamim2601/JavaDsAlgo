package Algorithms;

public class StarPattern {
    public static void main(String[] args) {
        int n = 13;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==(n-1)/2 || (i+j)==(n-1)/2 || (j-i)==(n-1)/2 ) System.out.print("*\t");
//                System.out.print("*\t");
                else System.out.print(" \t");
            }
            System.out.println();
        }
    }
}

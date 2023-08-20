package Algorithms;

public class UniqueElements {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 7, 1 ,2 , 5, 6, 1, 8, 3, 1, 7};
        // unique elements: 7, 2, 5, 8 : 4
        int numOfUnique = uniqueElementsFinder(numbers);

        System.out.println(numOfUnique);
    }

    private static int uniqueElementsFinder(int[] numbers) {
        int count = 0;
        int n = numbers.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i) continue;
                if(numbers[i]==numbers[j]) break;

                if(j == n-1) {
//                    System.out.println(numbers[i]);
                    count++;
                }
            }
        }

        return count;
    }
}

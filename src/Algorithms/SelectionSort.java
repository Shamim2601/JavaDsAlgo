package Algorithms;

public class SelectionSort {

    public static  void selectionSort(int[] numbers){
        int n = numbers.length;
        int minVal;
        int minIdx;

        // 4, 7, 5, 2, 9, 1, 3
        // 1], 7, 5, 2, 9, 4, 3
        // 1, 2], 5, 7, 9, 4, 3
        // 1, 2, 3], 7, 9, 4, 5
        // 1, 2, 3, 4], 9, 7, 5
        // 1, 2, 3, 4, 5], 7, 9
        // 1, 2, 3, 4, 5, 7], 9
        // 1, 2, 3, 4, 5, 7, 9]

        for(int i=0;i<n;i++){
            minIdx = i;
            minVal = numbers[i];
            for(int j=i+1;j<n;j++){
                if(numbers[j]<minVal){
                    minIdx = j;
                    minVal = numbers[j];
                }
            }

            // swap                  1st iteration
            int temp = numbers[i]; // temp = 4
            numbers[i] = minVal;   // numbers[0] = 1
            numbers[minIdx] = temp; // numbers[5] = 4
        }
    }

    public  static  void  showArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] numbers = {4, 7, 5, 2, 9, 1, 3};

        int[] n2 = {67, 23, 78, 12, 45, 69};

        selectionSort(numbers);
        selectionSort(n2);

        showArray(n2);

    }
}

package Algorithms;

public class QuickSort {
    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high)   // 0...6
    {
        // arr = { 10, 7, 8, 9, 3, 1, 4 }
        // 3, 7, 8, 9, 10, 1, 4
        // 3, 1, 8, 9, 10, 7, 4
        // 3, 1, 4, 9, 10, 7, 8
        // quicksort(0...1)
        // quicksort(3...6)
        // Choosing the pivot
        int pivot = arr[high];   // 4

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);  // -1

        for (int j = low; j <= high - 1; j++) {  // 0...5

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {  // 3, 1

                // Increment index of smaller element
                i++;  // 0, 1
                swap(arr, i, j);  // 10<>3, 7<>1
            }
        }
        swap(arr, i + 1, high);  //  8<>4
        return (i + 1);   // 2
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(int[] arr, int low, int high)  // recursive method
    {
        // arr = { 10, 7, 8, 9, 3, 1, 4 }   // 0...6
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high); // 2

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);  // 0...1
            quickSort(arr, pi + 1, high); // 3...6
        }
    }
    // To print sorted array
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 3, 1, 4 };
        int N = arr.length;  // 7

        quickSort(arr, 0, N - 1);  // 0...6
        // time complexity: O(nlogn)  // 16*log16=64
        // 2^3=8 => log2(8) = 3
        // log2(16) = 4
        // log1024 = 10
        // 1 kB = 1024 Byte
        // 1 Byte = 8 bit
        System.out.println("Sorted array:");
        printArr(arr);
    }
}

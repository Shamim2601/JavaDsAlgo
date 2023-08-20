package Algorithms;

import java.util.Scanner;

public class MergeSort {
    void merge(int arr[], int l, int m, int r)  // 0, 1, 3
    {
        int n1 = m - l + 1;   // 1-0+1 = 2  size of left sub-array
        int n2 = r - m;       // 3-1 = 2    size of right sub-array

        int L[] = new int[n1];  // extra space for left sub-array
        int R[] = new int[n2];  // extra space for right sub-array

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];   // L = [3,6]
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j]; // R = [2,8]

        int i = 0;  // pointer for left sub-array
        int j = 0;  // pointer for right sub-array

        int k = l;  // pointer for merged array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];  // take value from left
                i++;   // increase left pointer
            }
            else {
                arr[k] = R[j];  // take value from right
                j++;  // increase right pointer
            }
            k++;  // increase merge pointer
        }

        // copy remaining values to merged array
        while (i < n1) {  // from left sub-array
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {   // from right sub-array
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // why l<r ?
            // [3, 6, 2, 8] l=0 r=3
            // [3, 6] l=0 r=1 ; [2, 8] l=0 r=1
            // [3] l=0 r=0; [6] l=0 r=0; [2] l=0 r=0; [8] l=0 r=0

            int m = l + (r - l) / 2;  // m = 0 + (3 - 0)/2 = 1

            sort(arr, l, m);  // [3,6]
            sort(arr, m + 1, r);  // [2,8]

            merge(arr, l, m, r);  // merge sub-arrays l...m and m+1.....r
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int arr[]; // = { 12, 11, 13, 5, 6, 7 };
        arr = new int[size];
        System.out.print("Enter values: ");
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Given array is");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }
}

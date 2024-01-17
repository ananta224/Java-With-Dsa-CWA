/* Question: Use the following sorting algorithms to sort an array in DESCENDING order :
 a. Bubble Sort
  b. Selection Sort 
  c. Insertion Sort 
  d. Counting Sort

You can use this array as an example: [3, 6, 2, 1, 8, 7, 4, 5, 3, 1] */

package com.ananta;

public class SortingPractice {
    //Bubbler Sort
public static void BubbleSort(int arr[]){
    for (int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                //Swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
//Selection Sort
public static void SelectionSort(int arr[]){
    for (int i = 0; i < arr.length - 1; i++) {
        int minPos = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[minPos] > arr[j]) {
                minPos = j;
            }
        }
        // swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}
//Insertion Sort
    public static void InsertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // Finding the Actual position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insertion
            arr[prev + 1] = curr;
        }
    }
    //Count Sort
    public static void CountSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Sorting
        int j = 0;
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
//Print the element
public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println(" ");
}
    public static void main(String[] args) {
        int arr[] ={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        CountSort(arr);
        printArray(arr);
    }
}

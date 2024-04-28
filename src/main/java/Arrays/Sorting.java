/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Cliftonb
 */
public class Sorting {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};

        System.out.println(nums);
        improvedSelectionSort(nums);
        System.out.println(nums);
    }

    public static void bubbleSort(int[] arr) {

        for (int sortedIndex = arr.length - 1; sortedIndex >= 0; sortedIndex--) {
            for (int currentIndex = 0; currentIndex < sortedIndex; currentIndex++) {

                if (arr[currentIndex] > arr[currentIndex + 1]) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[currentIndex + 1];
                    arr[currentIndex + 1] = temp;
                }

            }
        }

    }
    
    public static void improvedBubbleSort(int[] arr) {
        boolean sorted = true;
        for (int sortedIndex = arr.length - 1; sortedIndex >= 0; sortedIndex--) {
            
            for (int currentIndex = 0; currentIndex < sortedIndex; currentIndex++) {

                if (arr[currentIndex] > arr[currentIndex + 1]) {
                    sorted = false;
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[currentIndex + 1];
                    arr[currentIndex + 1] = temp;
                }

            }
            
            if(sorted){
                break;
            }
        }

    }

    public static void selectionSort(int[] arr) {
        int swops = 0;
        int comparisons = 0;
        for (int sortedIndex = 0; sortedIndex < arr.length; sortedIndex++) {
            for (int currentIndex = sortedIndex + 1; currentIndex < arr.length; currentIndex++) {
                comparisons++;
                if (arr[currentIndex] < arr[sortedIndex]) {
                    swops++;
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[sortedIndex];
                    arr[sortedIndex] = temp;
                }
            }
        }

        System.out.println("Selection Sort\nSwops: " + swops + "\nComparisons: " + comparisons);

    }

    public static void improvedSelectionSort(int[] arr) {
        int swops = 0;
        int comparisons = 0;
        for (int sortedIndex = 0; sortedIndex < arr.length; sortedIndex++) {
            int smallestIndex = sortedIndex;
            for (int currentIndex = sortedIndex + 1; currentIndex < arr.length; currentIndex++) {
                comparisons++;
                if (arr[currentIndex] < arr[smallestIndex]) {
                    smallestIndex = currentIndex;
                }
            }
            
            swops++;
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
        }

        System.out.println("Selection Sort\nSwops: " + swops + "\nComparisons: " + comparisons);

    }

    public static int linearSearch(int value, int[] sortedArr) {
        for (int i = 0; i < sortedArr.length - 1; i++) {
            if (sortedArr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int value, int[] sortedArr) {
        int start = 0;
        int end = sortedArr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (sortedArr[middle] == value) {
                return middle;
            } else if (sortedArr[middle] > value) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

        }

        return -1;
    }

}

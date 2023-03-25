package org.example;


public class SearchAlg {
    public static void main(String[] args) {
        linearSearch(new int[] {1,2,3,4}, 4);
        binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 8);

    }

    public static int linearSearch(int arr[], int elimentToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elimentToSearch) {
                System.out.println(index);
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
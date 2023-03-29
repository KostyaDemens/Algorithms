package org.example.SearchAlg;

public class LinearSearch {

    public int linearSearch(int arr[], int elementToSearhc) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearhc) {
                System.out.println(index);
            }
        }
        return -1;
    }
}

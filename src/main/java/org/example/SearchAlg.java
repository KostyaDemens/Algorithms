package org.example;


public class SearchAlg {
    public static void main(String[] args) {
        linearSearch(new int[] {1,2,3,4}, 4);
    }

    public static int linearSearch(int arr[], int elimentToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elimentToSearch) {
                System.out.println(index);
            }
        }
        return -1;
    }
}
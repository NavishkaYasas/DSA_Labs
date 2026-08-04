package BinarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array, int n, int key) {
        int low = 0;
        int high = n - 1;
        boolean found = false;
        int position = -1;

        while (low <= high && !found) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                found = true;
                position = mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            return position;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 12;
        int[] array = new int[n];

        System.out.println("Enter 12 integers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Sort the array first (required for Binary Search)
        Arrays.sort(array);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the search key:");
        int key = sc.nextInt();

        int result = binarySearch(array, n, key);

        if (result != -1) {
            System.out.println("Element found at position " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

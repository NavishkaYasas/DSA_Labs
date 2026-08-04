package InsertionSort;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] array, int n) {
        for (int i = 1; i <= n - 1; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 12;
        int[] array = new int[n];

        System.out.println("Enter 12 numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        insertionSort(array, n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}

package SelectionSort;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] array, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int minimum = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            if (minimum != i) {
                int temp = array[i];
                array[i] = array[minimum];
                array[minimum] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] array = new int[n];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        selectionSort(array, n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
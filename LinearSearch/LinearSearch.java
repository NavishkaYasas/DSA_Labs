package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] array, int n, int key) {
        boolean found = false;
        int position = -1;

        for (int i = 0; i <= n - 1; i++) {
            if (array[i] == key) {
                found = true;
                position = i;
                break;
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
        int n = 10;
        int[] array = new int[n];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the search key:");
        int key = sc.nextInt();

        int result = linearSearch(array, n, key);

        if (result != -1) {
            System.out.println("Element found at position " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

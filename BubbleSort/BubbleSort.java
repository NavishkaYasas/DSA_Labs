import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] array, int n) {
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int[] array = new int[n];

        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        bubbleSort(array, n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
import java.util.Scanner;

class Solution {
    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i; j < n; j++) {
                if (arr[mini] > arr[j]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;

        }
        System.out.println("Selection Sort implemented");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] Arr = new int[n];
        System.out.println("Welcome to Selection_Sort DSA");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Array Element" + (i + 1) + ":");
            Arr[i] = sc.nextInt();
        }
        selectionSort(Arr, n);
        System.out.println("The Array Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arr[i]);
        }
        sc.close();
    }
}

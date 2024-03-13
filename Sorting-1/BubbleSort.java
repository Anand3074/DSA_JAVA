import java.util.Scanner;

class Solution2 {
    public static void bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println("Bubble Sort implemented");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] Arr = new int[n];
        System.out.println("Welcome to Bubble_Sort DSA");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Array Element" + (i + 1) + ":");
            Arr[i] = sc.nextInt();
        }
        bubbleSort(Arr, n);
        System.out.println("The Array Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arr[i]);
        }
        sc.close();
    }
}

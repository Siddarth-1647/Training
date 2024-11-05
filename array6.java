import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] array = new int[n];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Print even numbers in the array
        System.out.println("Even numbers in the array:");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();
    }
}

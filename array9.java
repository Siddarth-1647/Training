import java.util.Scanner;

public class array9 {
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

        // Print elements at odd indices
        System.out.println("Elements at odd indices:");
        for (int i = 1; i < n; i += 2) { // Start from 1 and increment by 2 for odd indices
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}

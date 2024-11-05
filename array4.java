import java.util.Scanner;
public class array4 {
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

        // Input the target element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform linear search
        int index = -1;  // -1 indicates that the element was not found
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                index = i;  // Store the index if target is found
                break;      // Exit the loop once the target is found
            }
        }

        // Output the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}

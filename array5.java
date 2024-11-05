import java.util.Arrays;
import java.util.Scanner;

public class array5 {
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

        // Sort the array (necessary for binary search)
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Input the target element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(array, target);

        // Output the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }

    // Binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (array[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target was not found
        return -1;
    }
}



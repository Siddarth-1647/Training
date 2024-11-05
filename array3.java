import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  
        }
        int largest = arr[0]; 
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; 
            }
        }
         System.out.println("The largest number in the array is: " + largest);
         scanner.close(); 
    }
}

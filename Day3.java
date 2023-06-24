import java.util.Scanner;

public class MaxNumberPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the values of the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxNumber = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("\nMaximum Number: " + maxNumber);
        System.out.println("Position of First Occurrence: " + (maxIndex + 1));
    }
}

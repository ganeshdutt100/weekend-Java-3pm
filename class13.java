package intro;

import java.util.Scanner;

public class class13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt(); // Store the user input in the array
        }

        // Print the elements of the array
        for (int b : a) {
            System.out.println(b);
        }
    }
}
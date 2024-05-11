package intro;
import java.util.Scanner;

public class class15 {


       public  static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            fun(size);
        }

        static void fun(int a) {

            System.out.println("Enter the size of the array:");

            int[] arr = new int[a];  // size

            for (int i = 0; i < a; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            System.out.println("The elements of the array are:");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
    }


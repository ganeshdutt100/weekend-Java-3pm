package intro;

import java.util.Scanner;

public class class14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        1 2 3 4
//        2 3 4 5
//        3 5 2 3

     int []a[]= {
             {1,2,3},
             {2,5,3},
             {5,7,8}
     };
       for( int i=0; i<a.length; i++){
           for(int j = 0; j<a[i].length; j++){
               System.out.print(a[i][j]+ " ");
           }
           System.out.println();
       }


       int arr1[][]= {
               {1,2,3,5,6,3,32,2},
               {2,5,3},
               {5,7,8,4,566,3,2}
     };
       for( int i=0; i<arr1.length; i++){
           for(int j = 0; j<arr1[i].length; j++){
               System.out.print(arr1[i][j]+ " ");
           }
           System.out.println();
       }


//
//       int arr3[][] = new int[3][];
//
//       arr3[0] = new int[]{2,5,6};
//       arr3[1] = new int[]{2,5,6,6,4,3};
//       arr3[2] = new int[]{2,5,6};
//
//       for(int i=0; i<arr3.length; i++){
//           for(int j = 0; j<arr3[i].length; j++){
//               System.out.print(arr3[i][j] + " ");
//           }
//           System.out.println();
//       }



                Scanner scanner = new Scanner(System.in);
                int arr3[][] = new int[3][];


                System.out.println("Enter your first 3 value ");
                arr3[0] = new int[3];
                for (int j = 0; j < 3; j++) {
                    arr3[0][j] = scanner.nextInt();
                }

                System.out.println("Enter second 6 value :");
                arr3[1] = new int[6];
                for (int j = 0; j < 6; j++) {
                    arr3[1][j] = scanner.nextInt();
                }

                System.out.println("Enter your third 3 value  : ");
                arr3[2] = new int[3];
                for (int j = 0; j < 3; j++) {
                    arr3[2][j] = scanner.nextInt();
                }

                for (int i = 0; i < arr3.length; i++) {
                    for (int j = 0; j < arr3[i].length; j++) {
                        System.out.print(arr3[i][j] + " ");
                    }
                    System.out.println();
                }


            }
        }




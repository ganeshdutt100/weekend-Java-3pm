package intro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class class17 {
    public static void main(String[] args) {
        System.out.println();
//        if(){
//            System.out.println("hello");
//        }
//        else{
//            System.out.println("hii");
//        }
//        int a[] = {1, 2, 3, 44, 0};
//        int  []d = Arrays.copyOf(a,8);
//        int  []d = Arrays.copyOfRange(a,2,5);
//        System.out.println(Arrays.toString(d));
//        int c[] = {1, 2, 3, 4,0};
//  int b [] = new int[7];
//  b[0] = 1;
//  b[1] = 28;
//  b[2] = 39;
//  b[3] = 4;
//  for(int i = 0; i < b.length; i++){
//      System.out.print(b[i]+ " ");
//  }
//   for(int x : b){
//       System.out.print(x);
//   }
//        System.out.println(Arrays.toString(b));
//  b[4] = 02;
//        Arrays.fill(b,78 );
//        System.out.println(Arrays.equals(a,b));
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.fill(45));

//        System.out.println(Arrays.toString(a));


        //        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.binarySearch(a,75));
//        for(int x :  a){
//            System.out.print(x);
//        }

//        System.out.println(fun(a,54));

       int arrayAman [] = {10,34,54,5,67,43,2,34,987};
       int removeElement = 54;

//        System.out.println(removeValue(arrayAman, removeElement));
       int arrayYash[] =  removeValue(arrayAman, removeElement);
        System.out.println("original "+ Arrays.toString(arrayAman));
        System.out.println("........." + Arrays.toString(arrayYash));
    }
//   methods
    public static boolean fun(int arr[]  , int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return true;
            }

        }
        return false;
    }


    public static int[] removeValue(int arr[], int value){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != value){
                count++;
            }
        }
        int newArray[] = new int[count];
        int aman = 0;
        for(int i = 0; i< newArray.length; i++){
            if(arr[i] != value){
              newArray[aman++] = arr[i];
            }
        }
        return  newArray;

    }
}

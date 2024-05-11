package intro;

import java.util.Scanner;

public class class14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        1 2 3 4
//        2 3 4 5
//        3 5 2 3

     int a[][]= {
             {1,2,3},{2,5,3},{5,7,8}
     };
       for( int i=0; i<a.length; i++){
           for(int j = 0; j<a[i].length; j++){
               System.out.print(a[i][j]+ " ");
           }
           System.out.println();
       }


    }

    }


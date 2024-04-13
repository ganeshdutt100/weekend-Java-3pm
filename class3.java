package intro;

import java.util.Scanner;

public class class3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
     int a = sc.nextInt();

      if(a == 1){
          System.out.println("mon");
      }
      else if(a == 2){
          System.out.println("tue");
      }
      else if(a == 3){
            System.out.println("wed");
        }
      else if(a == 4){
            System.out.println("thu");
        }

      else{
          System.out.println("error");
      }







//     if(a >=15){
//         System.out.println("true");
//     }else{
//         System.out.println("false");
//     }
    }
}

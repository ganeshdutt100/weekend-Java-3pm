package intro;
import java.util.Scanner;
public class class4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year :  ");
//        int year  = scanner.nextInt();
//
//        if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
//            System.out.println( year + " : is a leap year ");
//        }
//        else {
//            System.out.println( year  + " is not a leap year ");
//        }

//        int a = 300;
//        int b = 190;
//
//        if(a >= 250){
//            if( b >=200){
//                System.out.println(" enjoy");
//            }
//            else{
//                System.out.println("error 2");
//            }
//        }
//        else{
//            System.out.println("Error 1");
//        }

    int day  = 6;
    String dayName;
   switch(day){
       case 1:
           dayName = "mon";
           break;
       case 2 :
           dayName = "tue";
           break;
       default:
           dayName = " error";
   }
        System.out.println(dayName);

    }
}

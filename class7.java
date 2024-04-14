package intro;

import java.util.Scanner;

public class class7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter team1 marks..");
//        int team1 = sc.nextInt();
//
//        System.out.println("Enter team2 marks..");
//        int team2 = sc.nextInt();
//      int result  = printD(team1,team2);
//        System.out.println(result);


//        method2

//        int add = sum(14,65);
//        System.out.println("Function add.. "+ add);
//
//        System.out.println(" again call methods.."+sum(76,98));

//        method 3 (Another class)


        class8.AnotherClass();

    }
//first method
    public static int printD(int team1, int team2) {

        if (team1 >= team2) {
            System.out.println("Team 1 win ...." + team1);
            return (team1);
        } else {
            System.out.println("Team 2 win ...." + team2);
            return (team2);
        }


    }


//    method2
    public  static int sum(int a , int b){
        return (a + b);
    }
}

package intro;

import java.util.Scanner;

public class class7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter team1 marks..");
        int team1 = sc.nextInt();

        System.out.println("Enter team2 marks..");
        int team2 = sc.nextInt();
      int result  = printD(team1,team2);
        System.out.println(result);
    }

    public static int printD(int team1, int team2) {

        if (team1 >= team2) {
            System.out.println("Team 1 win ...." + team1);
            return (team1);
        } else {
            System.out.println("Team 2 win ...." + team2);
            return (team2);
        }
    }
}

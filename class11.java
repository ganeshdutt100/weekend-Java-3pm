package intro;

import Questions.nestedLoop;

public class class11 {
    public static void main(String[] args) {
        class11 obj1 = new class11();
        obj1.halfPyramid(4);
        obj1.halfPyramidNumber(5);
        obj1.halfPyramidChar();
        obj1.halfPyramidInvert(5);
        obj1.halfPyramidInvertNum(5);
        obj1.HalfPyramidReverse(5);
        obj1.fullPyramid(5);



    }
    //    halfPyramid
    public void halfPyramid(int rows){
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //    halfPyramid Using Number
    public void halfPyramidNumber(int rows){
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    //    halfPyramid Using Character's
    public void halfPyramidChar(){
        for(char i = 'a'; i<='e'; i++){
            for(char j = 'a'; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //  invert  halfPyramid
    public void halfPyramidInvert(int rows){
        for(int i = rows; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //  invert  halfPyramid using nubmer
    public void halfPyramidInvertNum(int rows){
        for(int i = rows; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //HalfPyramidReverse *
    public void HalfPyramidReverse(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Full Pyramid using *
    public void fullPyramid(int rows) {
        for(int i = 1; i <= rows; i++) {
            // Print spaces
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 1; k <= 2* i - 1; k++) {
                System.out.print("*" );
            }
            System.out.println();
        }
    }

    //Inverted full pyramid using *
    public void fullPyramidInvert(int rows) {
        for(int i = rows; i >= 1; i--) {

            for(int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }







}

package intro;

public class class11 {
    public static void main(String[] args) {
        class11 obj1 = new class11();
//        obj1.fun(5);
//        obj1.halfPyramidChar();
        obj1.halfPyramidStar(5);
    }

    public void fun(int rows){
     for(int i = 1; i <= rows; i++){
         for(int j = 1; j <=i; j++){
             System.out.print(j + " ");
         }
         System.out.println();
     }
    }
//    half pyramid using alphabets
    public void halfPyramidChar(){
     for(char i = 'a'; i<='e'; i++){
         for(char j = 'a'; j <=i; j++){
             System.out.print(i + " ");
         }
         System.out.println();
     }
    }
    //    half pyramid using alphabets
    public void halfPyramidStar(int rows){
     for(int i = 1; i<= rows; i++){
         for(int j = 1; j <=rows-i; j++){
             System.out.print(" ");
         }
         for(int k =1; k<=2 * i -1; k++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}

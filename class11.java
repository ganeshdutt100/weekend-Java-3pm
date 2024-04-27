package intro;

public class class11 {
    public static void main(String[] args) {
        class11 obj1 = new class11();
        obj1.fun(5);
    }

    public void fun(int rows){
     for(int i = 1; i <= rows; i++){
         for(int j = 1; j <=i; j++){
             System.out.print(j + " ");
         }
         System.out.println();
     }
    }
}

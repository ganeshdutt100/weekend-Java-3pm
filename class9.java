package intro;

import com.sun.source.tree.BreakTree;

public class class9 {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(sum(10));
        System.out.println(sum(10,34));
        System.out.println(sum(10,34,56));
        System.out.println(sum(10,34,5,897));
        System.out.println(sum(10,34,5,89,98));




//        class9 Aman = new class9();

//        System.out.println(Aman.shivam(12));
//        System.out.println(Aman.shivam(12,76));
//        System.out.println(Aman.shivam(12,76,87));


    }


//
//    public int shivam(int a){
//       return  a;
//    }
//    public int shivam(int b ,int c ){
//   return c+b;
//    } public int shivam(int b ,int c, int d ){
//         return c+b+d;
//    }


    public static int sum(int... num){
        int result = 0;
        for(int a : num){
            result+= a;
        }
        return result;

    }
}



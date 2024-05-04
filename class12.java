package intro;

public class class12 {
    public static void main(String[] args) {
//        String str = "yash";
//        String str1 = "shivang";
//        String str2 = "aman";
//        String  str3 = "Yash, Aman , shivang ";


        int[] arr = {12, 23, 54, 343, 322, 434, 76, 98};
//        System.out.println(arr[1] + "   "+ arr[0] +" "+ arr[3]);

//        System.out.println( "23"+ 12 + 22);

//        for(int x : arr){
//            System.out.print(x + " ");
//        }

//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }

        String str[] = {"Yash", "Shivang", " Aman", "Nikhil"};
        for (String a : str) {
            System.out.println(a);
        }

        int num [] = new int[9];
        num[1] = 12;
        num[0]= 11;
        num[2]= 13;
        num[3]= 14;
        num[4]= 15;
//        num[5]= 16;

        for(int x : num) {
            System.out.print(x + " ");
        }

    }

}

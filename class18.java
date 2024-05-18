package intro;

public class class18 {
    public static void main(String[] args) {
        int originalArray[] = {0, 1, 2, 3, 4, 5, 6,89,54,24,9,34};
//        System.out.println(originalArray[2]);

        System.out.print("Original array : ");
        for(int i = 0; i < originalArray.length; i++){
            System.out.print(originalArray[i] + " ");
        }

        System.out.println();

        int copiedArray[] = new int[originalArray.length];
        for(int i = 0; i < originalArray.length; i++){
            copiedArray[i] = originalArray[i];
        }
        System.out.print(" Copied Array : ");

        for(int i = 0; i < copiedArray.length; i++){
            System.out.print( copiedArray[i] + " ");

        }

    }
}

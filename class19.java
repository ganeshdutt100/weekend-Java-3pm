package intro;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

public class class19 {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 54, 25,16, 7};
//        int[] b = new int[a.length];
//        System.arraycopy(a,0,b, 2,2 );
//        System.out.println(Arrays.toString(b));

        int[] a = {1, 2, 3, 54, 25,16, 7};
        int[] b =  Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b));

    }
}
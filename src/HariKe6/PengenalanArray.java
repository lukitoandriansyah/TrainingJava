package HariKe6;

import java.util.Arrays;

public class PengenalanArray {
    public static void main(String[] args) {
        String[] arrs= new String[5];
        System.out.println(arrs.length);
        System.out.println(Arrays.toString(arrs));
        arrs[0]= "akbar";
        String nama = arrs[0];
        System.out.println("Nama: "+ nama);
        System.out.println(Arrays.toString(arrs));

    }
}

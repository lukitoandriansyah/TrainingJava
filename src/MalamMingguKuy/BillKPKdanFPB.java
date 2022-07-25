package MalamMingguKuy;

import java.util.Scanner;

import static MalamMingguKuy.FPB.findFPB;
import static MalamMingguKuy.KPK.findKPK;

public class BillKPKdanFPB {
    public long KPKFPB() {
        Scanner input = new Scanner(System.in);
        for (String c = "y"; c.equals("y") || c.equals("Y"); ) {
            System.out.println("===MENU===");
            System.out.println("[1] KPK");
            System.out.println("[2] FPB");
            int a = input.nextInt();

            System.out.print("Nilai N :" + " ");
            int b = input.nextInt();

            int[] array = new int[b];
            for (int n = 0; n < array.length; n++) {
                System.out.print("Nilai Input" + " " + n + " " + "=" + " ");
                array[n] = input.nextInt();
            }

            if (a == 1) {
                System.out.println("KPK =  " + findKPK(array, b));
            } else if (a == 2) {
                System.out.println("FPB = " + findFPB(array, b));
            }
            System.out.print("LANJUT??? [Y/T] =" + " ");
            c = input.next();
        }
        return 0;
    }

    public static void main(String[] args) {
        BillKPKdanFPB hasil = new BillKPKdanFPB();
        hasil.KPKFPB();
    }
}
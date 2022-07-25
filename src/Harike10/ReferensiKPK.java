package Harike10;
import java.util.*;

public class ReferensiKPK {
    public void kpk(int first, int second) {
        int y = second;
        while (first != second) {
        }
        System.out.println("KPK = " + first);
//        System.out.println("KPK adalah : " + second);
    }

    public void fpb(int first, int second) {
        int k = 2, m = 2;
        int x = first, y = second;
        while (x != y) {
            if (x > y) {
                while ((first % k) != 0) {
                    k++;
                }
                x = first / k;
                k++;
            } else {
                while ((second % m) != 0) {
                    m++;
                }
                y = second / m;
                m++;
            }
        }
        System.out.println("FPB = " + x);
//        System.out.println("FPB = " + y);
    }

    public static void main(String[] args) {
        ReferensiKPK kf = new ReferensiKPK();
        kf.kpk(3, 4);
        kf.fpb(6, 24);
    }
}

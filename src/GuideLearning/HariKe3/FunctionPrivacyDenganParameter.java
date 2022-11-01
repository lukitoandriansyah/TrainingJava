package GuideLearning.HariKe3;
import java.util.*;

public class FunctionPrivacyDenganParameter {
    static int hitungLuas(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    public static void main(String[] args){
        Scanner variabel = new Scanner(System.in);
        int masukan = variabel.nextInt();
        System.out.print(hitungLuas(masukan));
    }
}

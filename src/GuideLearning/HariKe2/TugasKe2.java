package GuideLearning.HariKe2;
import java.util.*;
import static GuideLearning.HariKe2.Refrensi2.ASCII_0;

public class TugasKe2 {
    public static void main (String[] args){
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String nama = variabel.nextLine();
        variabel.close();
        int spasi = 0, vokal = 0, count=0, JumlahKarakerNama = nama.length();
        for(int u = 0; u<JumlahKarakerNama; u++){
            char abjad = Character.toLowerCase(nama.charAt(u));

            if (abjad == 'a' || abjad == 'e' || abjad == 'i' || abjad == 'o' || abjad == 'u'){
                vokal ++;
            }
            if (abjad == 'a' || abjad == 'e' || abjad == 'i' || abjad == 'o' || abjad == 'u'){
                StringBuilder sb = new StringBuilder(nama);
                sb.setCharAt(u, (char) (count + 1 + ASCII_0));
                nama = sb.toString();
                count = (count + 1) % 10;
            }
            if (Character.isWhitespace(abjad)){
                if (u > 0 & u < JumlahKarakerNama )
                    spasi++;
            }
        }
        System.out.println("Jumlah Suku: "+ (spasi + 1) + "\n");
        System.out.println("Jumlah Huruf Vokal: "+ vokal + "\n");
        System.out.println("Hasil: " + nama + "\n");
        System.out.println("Jumlah huruf: " + (JumlahKarakerNama-(spasi)));
    }
}
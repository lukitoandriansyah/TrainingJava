package HariKe2;
import java.util.Arrays;
public class TugasKe2Revisi {
    public static void main(String[] args) {
//        char namaVariable  = '9';
//        System.out.println(namaVariable);
        String s = "lukito andriansyah";
        int jumlahKata = 0;
        int jumlahHuruf = 0;
        int counter = 1;
        String[] arrHuruf = s.split("");
        System.out.println("print Arr Huruf : ");
        System.out.println(Arrays.toString(arrHuruf));
        for (int i = 0; i < arrHuruf.length; i++){
            if (arrHuruf[i].equalsIgnoreCase(" ")) {

            } else {
                jumlahHuruf++; // jumlahHuruf = jumlahHuruf + 1;
            }

            if (arrHuruf[i].equalsIgnoreCase("a") ||
                    arrHuruf[i].equalsIgnoreCase("i") ||
                    arrHuruf[i].equalsIgnoreCase("u") ||
                    arrHuruf[i].equalsIgnoreCase("e") ||
                    arrHuruf[i].equalsIgnoreCase("o")){
                arrHuruf[i] = Integer.toString(counter++);
            }
            System.out.print(arrHuruf[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(arrHuruf));

        // jumlah kata
        String[] arrKata = s.split(" ");
        for (int i = 0; i < arrKata.length; i++){
            if(arrKata[i].equalsIgnoreCase("") ||
                    arrKata[i].equalsIgnoreCase(" ")){

            } else {
                jumlahKata++;
            }

        }
        System.out.println(Arrays.toString(arrKata));
        System.out.println("Panjang ArrKata : " + arrKata.length);
        System.out.println("jumlah kata = " + jumlahKata);
        System.out.println("jumlah Huruf = " + jumlahHuruf);
        System.out.println(Arrays.toString(arrHuruf));
    }
}

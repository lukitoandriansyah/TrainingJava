package GuideLearning.HariKe2;
import java.util.*;

public class Task2Revisi {
    public static void main(String[] args) {
//        char namaVariable  = '9';
//        System.out.println(namaVariable);
        Scanner variabel = new Scanner(System.in);
        System.out.println("Masukkan Kalimat yang anda inginkan: ");
        String s = variabel.nextLine();
        int jumlahKata = 0;
        int jumlahHurufVokal = 0;
        int jumlahHuruf = 0;
        int counter = 1;
        String[] arrHuruf = s.split("");
//        System.out.println("print Arr Huruf : ");
//        System.out.println(Arrays.toString(arrHuruf));
        for(int i=0; i< arrHuruf.length;i++){
            if(!(arrHuruf[i].equalsIgnoreCase(" "))){
                jumlahHuruf++;
            }
            if (arrHuruf[i].equalsIgnoreCase("a") ||
                    arrHuruf[i].equalsIgnoreCase("i") ||
                    arrHuruf[i].equalsIgnoreCase("u") ||
                    arrHuruf[i].equalsIgnoreCase("e") ||
                    arrHuruf[i].equalsIgnoreCase("o")) {
                arrHuruf[i] = Integer.toString(counter++);
                jumlahHurufVokal++;
            }

        }
        // jumlah kata
        String[] arrKata = s.split(" ");
        for (int i = 0; i < arrKata.length; i++){
            if(arrKata[i].equalsIgnoreCase("") ||
                    arrKata[i].equalsIgnoreCase(" ")){
            } else {
                jumlahKata++;
            }

        }
        System.out.print("Berikut adalah opsi menu yang bisa anda gunakan:  \n" +
                "1. Tampilkan Jumlah Huruf Kalimat ! \n" +
                "2. Tampilkan Jumlah Huruf Vokal Kalimat ! \n" +
                "3. Tampilan Jumlah Kata Dalam Kalimat ! \n" +
                "4. Tampilkan kembali kalimat tetapi semua huruf vokal diganti oleh angka berurut ! \n");

        System.out.println("Masukkan Angka dari pilihan yang tersedia: ");
        int opsi = variabel.nextInt();
        switch (opsi){
            case 1:
                System.out.print("JUmlah Huruf : "+jumlahHuruf+" \n");
                break;
            case 2:
                System.out.print("JUmlah Huruf Vokal : "+jumlahHurufVokal+" \n");
                break;
            case 3:
                System.out.print("Jumlah Kata : "+jumlahKata+" \n");
                break;
            case 4:
                System.out.println("Huruf vOkal diubah menjadi Angka: ");
                for(int i=0; i< arrHuruf.length;i++){
                    System.out.print(arrHuruf[i]);
                }
                break;
            default:
                System.out.println("Pilihan tidak ditemukan!!!\n" +
                        "Harap masukkan berupa angka sesuai pilihan ( 1 ,2 ,3, atau 4)");
        }
    }
}



package GuideLearning.HariKe3;

public class Part3SwitchCaseMethods {
    void switchCase(String nama, String pilihan) {
        Part1Task3 hasil = new Part1Task3();
        int opsi = Integer.parseInt(pilihan);
        switch (opsi) {
            case 1:
                System.out.print("JUmlah Huruf : " + hasil.banyakHuruf(nama) + " \n");
                break;
            case 2:
                System.out.print("JUmlah Huruf Vokal : " + hasil.banyakHurufVokal(nama) + " \n");
                break;
            case 3:
                System.out.print("Jumlah Kata : " + hasil.banyakSukuKata(nama) + " \n");
                break;
            case 4:
                System.out.println("Huruf vOkal diubah menjadi Angka: ");
                hasil.ubahHurufVokal(nama);
                break;
            case 5:
                System.out.println("Semua Info: ");
                System.out.print("JUmlah Huruf : " + hasil.banyakHuruf(nama) + " \n");
                System.out.print("JUmlah Huruf Vokal : " + hasil.banyakHurufVokal(nama) + " \n");
                System.out.print("Jumlah Kata : " + hasil.banyakSukuKata(nama) + " \n");
                System.out.println("Huruf vOkal diubah menjadi Angka: ");
                hasil.ubahHurufVokal(nama);
                break;
            default:
                System.out.println("Pilihan tidak ditemukan!!!\n" +
                        "Harap masukkan berupa angka sesuai pilihan ( 1, 2, 3, atau 4)");
                break;
        }
    }
}

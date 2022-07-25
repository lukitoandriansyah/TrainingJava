package TC1;

import java.util.Arrays;
import java.util.Scanner;

public class SoalNo2 {

    Scanner variabel = new Scanner(System.in);

    public int jumlahUang(){

        System.out.print("Jumlah uang Andi adalah: ");
        int n = variabel.nextInt();
        return n;
    }

    public int[] kerangkaBaju(){
        int input = 3;
        int[] baju = new int[input];
        isiKerangkaBaju(baju);
        return baju;
    }

    public void isiKerangkaBaju(int[] baju){
        for(int batas=0; batas<baju.length; batas++){
            baju[batas]= variabel.nextInt();
        }
    }

    public void cetakKerangkaBaju(){
        int[]baju = kerangkaBaju();
        System.out.print("Harga Baju: ");
        for(int batas=0; batas<baju.length; batas++){
            System.out.printf("%3d", baju[batas]);
        }
        System.out.println();
    }

    public int[] kerangkaKacaMata(){
        int input = 3;
        int[] kacaMata = new int[input];
        isiKerangkaKacaMata(kacaMata);
        return kacaMata;
    }

    public void isiKerangkaKacaMata(int[] kacaMata){
        for(int batas=0; batas<kacaMata.length; batas++){
            kacaMata[batas]= variabel.nextInt();
        }
    }

    public void cetakKerangkaKacaMata(){
        int[] kacaMata = kerangkaKacaMata();
        System.out.print("Harga KacaMata: ");
        for(int batas=0; batas<kacaMata.length; batas++){
            System.out.printf("%3s", kacaMata[batas]);
        }
        System.out.println();
    }

    public void cetakHasil(){
        int n = jumlahUang();
        int[] baju = kerangkaBaju();
        System.out.print("Harga Baju: ");
        for(int batas=0; batas<baju.length; batas++){
            System.out.printf("%3d", baju[batas]);
        }
        System.out.println();
        int[] kacaMata = kerangkaKacaMata();
        System.out.print("Harga KacaMata: ");
        for(int batas=0; batas<kacaMata.length; batas++){
            System.out.printf("%3s", kacaMata[batas]);
        }
        System.out.println();

        int[] hasil = new int[18];

        if(baju[0] > n || baju[1] > n||baju[2] > n||kacaMata[0] > n||kacaMata[1] > n||kacaMata[2] > n){
            System.out.print("Dana Tidak Mencukupi");

        }
        else{
            hasil[0] = baju[0]+kacaMata[0];
            hasil[1] = baju[0]+kacaMata[1];
            hasil[2] = baju[0]+kacaMata[2];
            hasil[3] = baju[2]+kacaMata[0];
            hasil[4] = baju[2]+kacaMata[1];
            hasil[5] = baju[2]+kacaMata[2];
            hasil[6] = baju[1]+kacaMata[0];
            hasil[7] = baju[1]+kacaMata[1];
            hasil[8] = baju[1]+kacaMata[2];


            System.out.print("Hasil: ");
            for(int batas=0; batas< hasil.length; batas++){
                if(hasil[batas]<=n){
                    Arrays.sort(hasil);
                    System.out.printf("%3d", hasil[batas]);

                }
                //break;
                //System.out.printf("%3d", hasil[hasil.length -1]);

            }



        }

    }

    public static void main(String[] args) {
        SoalNo2 hasil = new SoalNo2();
        hasil.cetakHasil();
        //hasil.cetakKerangkaKacaMata();
    }
}

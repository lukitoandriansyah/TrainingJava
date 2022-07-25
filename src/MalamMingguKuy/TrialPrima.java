package MalamMingguKuy;
import java.util.Scanner;

public class TrialPrima {
    Scanner input = new Scanner(System.in);
     public int banyakInput(){
         System.out.print("Masukkan jumlah bilanagn Prima yang ingin ditampilkan: ");
         int banyakBilangan =input.nextInt();
         return banyakBilangan;

     }

     public int[] kerangkaArrayPrima(){
         int panjangArrayPrima = banyakInput();
         int[] arrayPrima = new int[panjangArrayPrima];
         isiKerangkaArrayPrima(arrayPrima);
         return arrayPrima;
     }

     public void isiKerangkaArrayPrima(int[] arrayPrima){
         int inisiasiAwal =1;
         int bilPrimaAwal =2;
         while(inisiasiAwal <= arrayPrima.length)
         {
             boolean cekPrima =true;

             for (int batasBilanganPrima = 2; batasBilanganPrima <= bilPrimaAwal /2; batasBilanganPrima++)
             {
                 if(bilPrimaAwal % batasBilanganPrima ==0)
                 {
                     cekPrima =false;
                     break;
                 }
             }

             if(cekPrima)
             {
                 if(inisiasiAwal %10==0)
                 {
                     int bilPrima = bilPrimaAwal;
                     //System.out.println(bilPrima);
                     arrayPrima[inisiasiAwal-1]=bilPrima;
                 }
                 else
                 {
                     int bilPrima = bilPrimaAwal;
                     //System.out.print(bilPrima +" ");
                     arrayPrima[inisiasiAwal-1]=bilPrima;
                 }
                 inisiasiAwal++;
             }
             bilPrimaAwal++;
         }

     }

     public void cetakKerangkaArrayPrima(){
         int[] arrayPrima = kerangkaArrayPrima();
         for (int arrKe = 0; arrKe<arrayPrima.length; arrKe++){
             System.out.printf("%3s", arrayPrima[arrKe]);
         }
     }


    public static void main(String[] args) {
         TrialPrima hasil = new TrialPrima();
         hasil.cetakKerangkaArrayPrima();

    }
}

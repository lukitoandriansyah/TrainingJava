package GuideLearning.MalamMingguKuy;
import java.util.*;

public class BuatListSatuDimensi {
    Scanner variabel = new Scanner(System.in);

    //Buat banyak  Input
    public int jumlahInputN(){
        System.out.print("Masukkan jumlah nilai input N: ");
        int n = variabel.nextInt();
        return n;
    }

    //Buat kerangka list
    public ArrayList kerangkaList(){
        int panjangList = jumlahInputN();
        ArrayList listContoh = new ArrayList();
        //cetakKerangkaList(listContoh);
        isiKerangkaList(listContoh, panjangList);
        return listContoh;
    }

    //Isi kerangka list
    public void isiKerangkaList(ArrayList listContoh, int panjangList){
        //int panjangList = jumlahInputN();
        for(int index = 0; index< panjangList; index++){
            listContoh.add(index*2);
        }
    }


    //Cetak kerangka list
    public void cetakKerangkaList(){
        ArrayList contoh = kerangkaList();
        for( int i = 0; i<contoh.size(); i++){
            System.out.println(contoh.get(i));
        }
        System.out.println(contoh.size());
        System.out.println(contoh);
    }


    public static void main(String[] args) {
        BuatListSatuDimensi hasil = new BuatListSatuDimensi();
        hasil.cetakKerangkaList();
    }
}

package MalamMingguKuy;

import java.util.ArrayList;
import java.util.Scanner;

public class BuatListDuaDimensi {
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
        //isiKerangkaList(listContoh, panjangList);
        return listContoh;
    }

    public ArrayList arr1(){
        ArrayList listContoh1 = kerangkaList();
        isiKerangkaList1(listContoh1);
        return  listContoh1;
    }

    public ArrayList arr2(){
        ArrayList listContoh2 = kerangkaList();
        isiKerangkaList2(listContoh2);
        return listContoh2;
    }

    //Isi kerangka list
    public void isiKerangkaList1(ArrayList listContoh1){
        int panjangList = jumlahInputN();
        for(int index1 = panjangList/2; index1< panjangList; index1++){
            listContoh1.add(index1);
        }
    }

    public void isiKerangkaList2(ArrayList listContoh2){
        int panjangList = jumlahInputN();
        for(int index2 = 0; index2< panjangList/2; index2++){
            listContoh2.add(index2);
        }
    }


    //Cetak kerangka list
    public void cetakKerangkaList(){
        ArrayList contoh = kerangkaList();
        for( int i = 0; i<2; i++){
            if(i == 0){
                System.out.println(contoh.add(arr2()));
            }
            else{
                System.out.println(contoh.add(arr1()));
            }
        }
        System.out.println(contoh.size());
        System.out.println(contoh);
    }


    public static void main(String[] args) {
        BuatListDuaDimensi hasil = new BuatListDuaDimensi();
        hasil.cetakKerangkaList();
    }
}

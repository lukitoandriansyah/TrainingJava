package MiniSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class solverPatternSeries {

    public int banyakInput(){
        Scanner variabel = new Scanner(System.in);
        System.out.print("Jumlah input deret anda :");
        int parameter = variabel.nextInt();
        //variabel.close();
        return parameter;
    }

    public int[] buatKerangkaList(){
        int n = banyakInput();
        int[] deret = new int[n];
        isiBuatKerangkaList(deret);
        return deret;
    }

    public void isiBuatKerangkaList(int[] deret){
        Scanner variabel = new Scanner(System.in);
        for(int i = 0; i< deret.length; i++){
            System.out.print("Input deret ke - "+(i+1)+" :");
            deret[i]=variabel.nextInt();
        }
    }

    public void cetakBuatKerangkaList(ArrayList deret){
        int[] hasil = buatKerangkaList();
        System.out.println("Deret yang anda miliki adalah : ");
        for (int i = 0; i<hasil.length; i++){
            System.out.printf("%3s", hasil[i]);
        }
        System.out.println();
        for (int i = 0; i<hasil.length; i++){
            for(int j = 0; j<hasil.length; j++){
                if(j>i && hasil[j]-hasil[i]==j-i){
                    deret.add(i, hasil.length+j);
                }else if(hasil[j]%2==0){
                    deret.add(i, hasil[hasil.length-1]+(2*(j+1)));
                }else if(hasil[j]%2!=0){
                    deret.add(i, hasil[hasil.length-1]+((2*j)+2));
                }else{
                    deret.add(0, "Opsi Belum Dibuat");
                }
            }break;
        }
    }

    public ArrayList deretPola1(){
        ArrayList deret = new ArrayList();
        cetakBuatKerangkaList(deret);
        return deret;
    }

    public void cetakDeretPola1(){
        ArrayList hasilDeret = deretPola1();
        Collections.sort(hasilDeret);
        System.out.println("Deret yang anda miliki Selanjutnya adalah : ");
        for(int i = 0; i<hasilDeret.size(); i++){
            System.out.printf("%3s", hasilDeret.get(i));
        }
    }



    public static void main(String[] args) {
        solverPatternSeries hasil = new solverPatternSeries();
        hasil.cetakDeretPola1();
    }
}

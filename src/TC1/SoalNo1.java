package TC1;

import java.util.Scanner;

public class SoalNo1 {
    public int jumlahINput(){
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan jumlah input n: ");
        int n = variabel.nextInt();
        return n;
    }

    public String[] kerangkaArray(){
        int input = jumlahINput();
        String[] array = new String[input];
        isiKerangkaArray(array);
        return array;
    }

    public int[] kerangkaFibo(int n){
        int[] fibo = new int[n];
        fibo[0]=1;
        fibo[1]=1;
        for( int i = 2; i<fibo.length; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo;
    }

    public String[] kerangkaFiboString(int n){
        int[] fibo = kerangkaFibo(n);
        String[] fiboString = new String[n];
        for ( int i = 0; i<n; i++){
            fiboString[i]= String.valueOf(fibo[i]);
        }
        return fiboString;
    }

    public void isiKerangkaArray(String[] array){
        for(int batas=0; batas<array.length; batas++){
            array[batas]= String.valueOf(batas*2+1);
        }
    }

    public void cetakKerangkaArray(){
        int n = jumlahINput();
        String[]array = kerangkaFiboString(n);
        for(int batas=0; batas<array.length; batas++){
            System.out.printf("%3s", array[batas]);
        }
        System.out.println();

        for(int batas= array.length-1; batas>=0; batas--){
            System.out.printf("%3s", array[batas]);
        }
    }


    public static void main(String[] args) {
        SoalNo1 hasil = new SoalNo1();
        hasil.cetakKerangkaArray();
    }


}

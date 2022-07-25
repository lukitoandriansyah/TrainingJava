package HariKe9.hackerRank;

import java.util.Scanner;

public class Task3 {
    public int banyakInputN(){
        System.out.print("Masukkan input N: ");
        Scanner variabel = new Scanner(System.in);
        int n = variabel.nextInt();
        variabel.close();
        return n;
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
    public char[] kerangkaChar(int n){
        char[] chara = new char[n];
        chara[0]= 'A';
        for ( int i= 1; i<n; i++){
            chara[i]= (char) (chara[i-1]+1);

        }
        return chara;
    }

    public String[] kerangkaCharString(int n){
        char[] chara = kerangkaChar(n);
        String[] charString = new String[n];
        for ( int i = 0; i<n; i++){
            charString[i]= String.valueOf(chara[i]);
        }
        return charString;
    }

    public String[][] kerangkaArray(){
        int n = banyakInputN();
        String[][] array = new String[n][n];
        if (n%2==0){
            System.out.println("Nilai N harus ganjil");
        }else{
            isiKerangkaArray(array);
        }
        return array;
    }

    public void isiKerangkaArray(String[][] array){
        String[] fiboValue = kerangkaFiboString(array.length);
        String[] charaValue = kerangkaCharString(array.length);
//        int inputArray ;
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array.length; j++){
//                array[i][j]="*";
                if (i <= array.length/2 && i + j<=array.length-1 && i<=j && i%2==0){
                    //System.out.printf("%3s", "*");
                    array[i][j] = String.valueOf(fiboValue[i/2]);
                    //array[i][j] = "*";
                }else if (i>=j && i>array.length/2 && i+j>=array.length-1&& i%2==0){
                    //System.out.printf("%3s", "*");
                    //array[i][j] = "*";
                    array[i][j] = String.valueOf(fiboValue[(array.length-1-i)/2]);
                }else if(j >= array.length/2 && i + j>=array.length-1 && i<=j && j%2==0){
                    //System.out.printf("%3s", "*");
                    //array[i][j] = "*";
                    array[i][j] = String.valueOf(fiboValue[(array.length-1-j)/2]);
                }else if(j < array.length/2 && i + j<array.length-1 && i>=j && j%2==0){
                    //System.out.printf("%3s", "*");
                    //array[i][j] = "*";
                    array[i][j] = String.valueOf(fiboValue[j/2]);
                }else if(i <= array.length/2 && i + j<=array.length-1 && i<=j && i%2!=0){
                    //System.out.printf("%3s", "*");
                    array[i][j] = String.valueOf(charaValue[i/2]);
                    //array[i][j] = "*";
                }else if(i>=j && i>array.length/2 && i+j>=array.length-1&& i%2!=0){
                    //System.out.printf("%3s", "*");
                    array[i][j] = String.valueOf(charaValue[(array.length-1-i)/2]);
                    //array[i][j] = "*";
                }else if(j >= array.length/2 && i + j>=array.length-1 && i<=j && j%2!=0){
                    //System.out.printf("%3s", "*");
                    array[i][j] = String.valueOf(charaValue[(array.length-1-j)/2]);
                    //array[i][j] = "*";
                }else if(j < array.length/2 && i + j<array.length-1 && i>=j && j%2!=0){
                    //System.out.printf("%3s", "*");
                    array[i][j] = String.valueOf(charaValue[j/2]);
                    //array[i][j] = "*";
                }else{
                    //System.out.printf("%3s", " ");
                    array[i][j] = " ";
                }
            }
        }//System.out.println();
    }

    public void cetakKerangkaArray(){
        String[][] array = kerangkaArray();
        for (int baris = 0 ; baris<array.length; baris ++){
            for (int kolom = 0 ; kolom<array.length; kolom ++){
                System.out.printf("%3s", array[baris][kolom]);
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        Task3 hasil = new Task3();
        hasil.cetakKerangkaArray();
    }
}

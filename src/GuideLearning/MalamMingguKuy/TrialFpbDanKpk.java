package GuideLearning.MalamMingguKuy;
import java.util.Objects;
import java.util.Scanner;

public class TrialFpbDanKpk {
    Scanner variabel = new Scanner(System.in);

    //Jumlah input
    public int jumlahInput(){
        System.out.print("Masukkan jumlah input: ");
        int banyakInput = variabel.nextInt();
        //variabel.close();
        return banyakInput;
    }

    //Kerangka array
    public int[] kerangkaArray(){
        int panjangArr = jumlahInput();
        int[] arr = new int[panjangArr];
        isiKerangkaArray(arr);
        return arr;
    }

    public void isiKerangkaArray(int[] arr){
        for (int nilaiKe = 0; nilaiKe < arr.length; nilaiKe++){
            System.out.print("Masukkan nilai ke-"+ (nilaiKe+1 +": "));
            arr[nilaiKe] = variabel.nextInt();

        }
        //variabel.close();
    }

    public void cetakArray(){
        int[] arr = kerangkaArray();
        System.out.println("Nilai yang anda masukkan adalah sebagai berikut: ");
        for (int nilaiKe = 0; nilaiKe < arr.length; nilaiKe++ ){
            System.out.printf("%3d", arr[nilaiKe]);
        }
        System.out.println();
    }

    //public int nilaiInputm(){
    //    int m=12;
    //    return m;
    //}

    //public int nilaiInputn(){
    //    int n=6;
    //    return n;
    //}


    public void kondisi(){
        System.out.print("Apakah anda ingin mengulang pilihan? [Y/N] ");
        String keputusan = variabel.next();
        if(Objects.equals(keputusan, "Y")){
            pilihan();
        }else if (Objects.equals(keputusan, "N")) {
            System.out.print("Terima kasih sudah menggunakan menu kami☺️");
            System.exit(0);
        }else {
            System.out.println("Pilihan tidak ada, pilih dengan benar!!!");
            kondisi();
        }
    }

    public void pilihan(){
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan pilihan Anda!!! ");
        int nomorPilihan = variabel.nextInt();
        //do
        //{
            switch ( nomorPilihan )
            {
                case 1:
                    kpk();
                    kondisi();
                    break;
                case 2:
                    fpb();
                    kondisi();
                    break;
                case 3:
                    kpk();
                    fpb();
                    kondisi();
                    break;
                case 4:
                    System.out.print("Terima kasih sudah menggunakan menu kami☺️");
                    System.exit(0);
                    break;
                default:
                    System.out.println ("Error!!! \n pilih menu 1-4");
                    pilihan();
                    break;
            }
        //}
        //while (nomorPilihan > 0 && nomorPilihan != 4 );
    }


    public void kpk(){
        int[] arr = kerangkaArray();
        int m = arr[0];
        int n = arr[1];
        if (m<n)
        {
            int cad=m;
            m=n;
            n=cad;

            hitungKPK (m, n);

        }

        else
        {
            hitungKPK (m, n);
        }
    }


    public void hitungKPK(int m, int n){
        int inisiasiKPK = 0;
        int faktor=1;
        for (int i=2;i<=n;i++)
        {
            int sisa=n%i;
            if (sisa==0)
            {
                for(int j=2;i<=m;j++)
                {
                    if ((m%j)==0)
                    {
                        if(i==j)
                        {
                            faktor=j;
                            break;
                        }
                        inisiasiKPK += (m*n/faktor);
                        break;
                    }
                }
            }
        }
        if (faktor == 1){
            int kpk = inisiasiKPK;
            System.out.println("KPK = "+kpk);
        }
        else{
            System.out.println("KPK = "+m*n/faktor);
        }

    }

    public void fpb(){
        int[] arr = kerangkaArray();
        int m = arr[0];
        int n = arr[1];
        int r = m % n;
        while (r != 0)
        {
            n = m;
            m = r;
            r = n % m;
        }
        System.out.println("FPB = "+m);
    }

    public static void main(String[] args) {
        TrialFpbDanKpk hasil = new TrialFpbDanKpk();
        //hasil.cetakArray();
        hasil.pilihan();
    }
}

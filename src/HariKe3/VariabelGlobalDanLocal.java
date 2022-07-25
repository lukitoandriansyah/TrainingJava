package HariKe3;
//c

public class VariabelGlobalDanLocal {
   // ini variabel global
   static String nama = "Programku";
   static String version = "1.0.0";

   static void help(){

      // ini variabel lokal
      String nama = "Petani Kode";

      // mengakses variabel global di dalam fungso help()
      System.out.println("Nama: " + nama);
      System.out.println("Versi: " + version);
   }

   public static void main(String args[]){

      // panggil fungsi help()
      help();

      System.out.println("Nama: " + nama);
      System.out.println("Versi: " + version);

   }
}

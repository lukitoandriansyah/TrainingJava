package testNgu;

public class Enumi {

        public enum Zodiak{
            CAPRICON, AQUARIUS, LEO, SAGITARIUS, ARIES, TAURUS, VIRGO, LIBRA;
        }

        //Membuat Objek dari Enum
        private Zodiak zodiak;

        //Sebuah Konstruktor dengan Parameter Enum
        public Enumi(Zodiak zodiak){
            this.zodiak = zodiak;
        }

        //Mendefinisikan Nilai pada Masing-Masing Variable Enum
        void DaftarZodiak(){
            //Method Switch Digunakan Untuk Menentukan Opsi Mana Yang Akan Dipilih
            switch(zodiak){
                case AQUARIUS:
                    System.out.println("AQUARIUS: 21 Januari - 19 Februari");
                    break;
                case ARIES:
                    System.out.println("ARIES: 21 Maret-19 April");
                    break;
                case CAPRICON:
                    System.out.println("CAPRICON: 22 Desember - 20 Januari");
                    break;
                case LIBRA:
                    System.out.println("LIBRA: 23 September-23 Oktober");
                    break;
                case LEO:
                    System.out.println("LEO: 23 Juli-23 Agustus");
                    break;
                case SAGITARIUS:
                    System.out.println("SAGITARIUS: 23 November-21 Desember");
                    break;
                case TAURUS:
                    System.out.println("TAURUS: 21 April-20 Mei");
                    break;
                case VIRGO:
                    System.out.println("VIRGO: 24 Agustus-22 September");
                    break;
            }
        }

        public static void main(String[] args){
            //Membuat Instance/Objek Serta Menentukan Variable/Opsi Mana Yang Akan Dipilih
            Enumi data1 = new Enumi(Zodiak.ARIES);
            data1.DaftarZodiak();

            Enumi data2 = new Enumi(Zodiak.AQUARIUS);
            data2.DaftarZodiak();

            Enumi data3 = new Enumi(Zodiak.LEO);
            data3.DaftarZodiak();

            Enumi data4 = new Enumi(Zodiak.TAURUS);
            data4.DaftarZodiak();

            Enumi data5 = new Enumi(Zodiak.VIRGO);
            data5.DaftarZodiak();
        }

}

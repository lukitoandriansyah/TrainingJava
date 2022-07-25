package Inherritence;


//extends hanya bisa untuk satu penggunaan
public class SegiTiga extends BangunDatar{
    private Integer alas;

    @Override
    public void getKeliling() {
        System.out.println("Ini adalah keliling segitiga: ");
    }
    @Override
    public void getLuas(){
        System.out.println("Ini adalah luas segitiga");
    }

    public static void main(String[] args) {
        SegiTiga s = new SegiTiga();
        s.luas = 7;
        s.getLuas();
        s.getKeliling();
    }

    //Dalam satu kelas jika ada yang override, maka
    //niai yang terpanggil adalah nilai yang dilakukan
    //override tersebut


}

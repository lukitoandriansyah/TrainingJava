package Interface;

//Kumpulan Abstract Methods
//Fieldnya adalah Static Final, digunakan sebagai konstanta


public interface BangunDatarInterface {
    //pasti public static final
    //final bererati nilainya tidak dapat diubah
    //Penulisannya menggunakan huruf kapital dan pemisah underscore
    //untuk setiap katanya
    public static final Integer DATA_LUAS = 5;

    //Method di interface pasti public
    public void getKeliling();
}

package GuideLearning.Inherritence;

public class BangunRuang extends BangunDatar{
    public void getVolume(){
        System.out.println("Ini adalah volume bangun ruang");
    }

    @Override
    public void getKeliling() {
        System.out.println("Ini keliling di bangun ruang: ");
    }
}

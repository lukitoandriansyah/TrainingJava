package GuideLearning.Inherritence;

public abstract class BangunDatar {
    public Integer luas;
    public Integer keliling;

    public void getLuas(){
        System.out.println("Ini adalah luas nangun" +
                "datar: "+luas);
    }

    //abstract adalah methode yang tidak memiliki body
    public abstract void getKeliling();
}
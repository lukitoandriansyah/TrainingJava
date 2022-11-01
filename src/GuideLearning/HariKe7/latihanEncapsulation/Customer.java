package GuideLearning.HariKe7.latihanEncapsulation;

public class Customer {
    private String nama;
    private String id;
    private int umur;
    private Double saldo;

    private Double hitungSaldo(){
        Double nilai = 9.00 - 4.00;
        return nilai;
    }


    public Double getSaldo(){
        this.saldo = hitungSaldo();
        return this.saldo;
    }

    public void hitungAngsuran(){

    }
}

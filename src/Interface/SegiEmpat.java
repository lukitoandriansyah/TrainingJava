package Interface;

import Inherritence.BangunDatar;

//class extends class
//interface --> class implement interface
public class SegiEmpat implements BangunDatarInterface {
    @Override
    public void getKeliling() {

        System.out.println("Ini keliling segi empat: " + DATA_LUAS);
    }

    public static void main(String[] args) {
        System.out.println(BangunDatarInterface.DATA_LUAS);
    }
}

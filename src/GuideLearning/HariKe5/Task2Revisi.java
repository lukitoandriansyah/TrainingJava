package GuideLearning.HariKe5;

import java.util.Scanner;

public class Task2Revisi {
    public int ambilN(){
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = variabel.nextInt();
        return n;
    }

    public void kerangkaFrame(){
        int batas = ambilN();
        for (int i = 0; i<batas; i++){
            int batas2 = batas*(batas-1)+1;
            for (int j =0 ; j<batas2; j++){
                if (i % (batas-1) == 0){
                    System.out.printf("%3s", "*");
                }else{
                    if(j % (batas-1) == 0){
                        System.out.printf("%3s", "*");
                    }else{
                        System.out.printf("%3s", "");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Task2Revisi frame = new Task2Revisi();
        frame.kerangkaFrame();

    }

}

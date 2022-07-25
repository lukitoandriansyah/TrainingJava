package HariKe5;

import java.util.Scanner;

public class Task2 {
    public int ambilN(){
        Scanner variabel = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = variabel.nextInt();
        return n;
    }

    public void kerangkaFrame(){
        int batas = ambilN();
        for (int i = 0; i<batas; i++){
            //int batas2 = batas*(batas-1)+1;
            for (int j =0 ; j<batas; j++){
                if (batas % 2 == 0){
                    if (j%3==0){
                        System.out.printf("%3s", "*");
                    }else{
                        if(i>0 && i<batas-1){
                            System.out.printf("%3s", " ");
                        }else{
                            System.out.printf("%3s", "*");
                        }
                    }
                }else if (batas %2 != 0){
                    if(j % 4 == 0){
                        System.out.printf("%3s","*");
                    }else{
                        if(i>0 && i<batas-1){
                            System.out.printf("%3s", " ");
                        }else{
                            System.out.printf("%3s", "*");
                        }
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Task2 frame = new Task2();
        frame.kerangkaFrame();

    }

}

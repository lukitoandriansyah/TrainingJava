package HackerRank;

import java.util.Scanner;

public class Latihan10JavaStaticInitializerBlock {
    static Scanner variabel = new Scanner(System.in);
    static int B = variabel.nextInt();
    static int H = variabel.nextInt();

    public static void main(String[] args){
        boolean flag = false;
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}

package GuideLearning.HackerRank;

import java.util.Scanner;

public class Latihan9JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner variabel = new Scanner (System.in);
        int i = 1;
        while(variabel.hasNextLine()){
            System.out.println(i + " " + variabel.nextLine());
            i++;
        }
    }
}

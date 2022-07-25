package HackerRank;

import java.util.*;

public class Latihan19JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()){
            System.out.println("0");
            return;
        }
        String s = scan.nextLine();
        // Write your code here.
        String[] b=s.trim().split("[!,?.*_'@ ]+");
        System.out.println(b.length);
        for (int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }
        scan.close();
    }
}


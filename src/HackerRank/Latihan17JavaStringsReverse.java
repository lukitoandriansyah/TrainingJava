package HackerRank;

import java.util.*;

public class Latihan17JavaStringsReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String b = "";
        for (int i = A.length()-1; i>=0; i--){
            b = b+A.charAt(i);
        }
        String c;
        c = (b.equals(A))? "Yes" : "No";
        System.out.print(c);
        //     if (b.equals(A)){
        //         System.out.print("Yes");
        //     }else{
        //         System.out.print("No");
        //     }

    }
}





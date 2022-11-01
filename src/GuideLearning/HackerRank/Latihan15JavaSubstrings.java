package GuideLearning.HackerRank;

import java.util.*;

public class Latihan15JavaSubstrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.print(S.substring(start,end));
    }
}

package GuideLearning.HariKe2;
import java.util.*;

public class Refrensi2 {
    public static final int ASCII_0 = 48;

    public static void main(String[] args) {
        System.out.println("Kalimat : ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        System.out.println("\nHasil: ");
        System.out.println(nomorString(str1));
    }
    public static String nomorString(String str1){
        int count = 0;
        for (int i=0 ; i<str1.length(); i++){
            char ch = Character.toLowerCase(str1.charAt(i));
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){

                StringBuilder sb = new StringBuilder(str1);
                sb.setCharAt(i, (char) (count + 1 + ASCII_0));
                str1 = sb.toString();
                count = (count + 1) % 10;
            }
        }
        return str1;
    }
}



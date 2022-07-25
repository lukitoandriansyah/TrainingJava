package HariKe2;
import java.util.*;

public class trial {
    public static void main(String[] args){
        Scanner variabel = new Scanner(System.in);
        int N = variabel.nextInt();
        if (N%2!=0){
            while (N>=1 & N<=100){
                System.out.println("Weird");
                break;
            }
        }
        if (N%2==0){
            while (N>=1 & N<=100){
                if (N>=2 & N<=5){
                    System.out.println("Not Weird");
                }
                if (N>=6 & N<=20){
                    System.out.println("Weird");
                }
                if (N>20){
                    System.out.println("Not Weird");
                }
                break;
            }
        }
    }
}

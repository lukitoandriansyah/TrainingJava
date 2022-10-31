package NawaDataSolution;

import java.util.Scanner;

public class Logic2Revised3 {

    public static void main(String[] args) {
        Scanner variabel = new Scanner(System.in);
        System.out.print("Input the number of families : ");
        String m = variabel.nextLine();
        System.out.print("Input the number of members in the family (Separated by a space): ");
        String n = variabel.nextLine();
        int maxPass = 4;
        String[] totalEachMemberFams = n.split(" ");
        if (Integer.parseInt(m) == totalEachMemberFams.length) {
            int count = 0;
            for (int i = 0; i < totalEachMemberFams.length; i++) {
                count += Integer.parseInt(totalEachMemberFams[i]);
            }
            if (count % maxPass != 0) {
                System.out.print("Minimum bus required is: ");
                System.out.printf("%d", count / maxPass + 1);
            } else {
                System.out.print("Minimum bus required is: ");
                System.out.printf("%d", count / maxPass);
            }
        } else {
            System.out.println("Input must be equal to count family");
        }
    }
}

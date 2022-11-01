package GuideLearning.NawaDataSolution;

import java.util.Scanner;

public class Logic2Revised2 {
    Scanner variabel = new Scanner(System.in);

    public int totalFamily() {
        System.out.print("Input the number of families : ");
        int m = variabel.nextInt();
        return m;
    }

    public String totalEachMemberOfFamily() {
        System.out.print("Input the number of members in the family (Separated by a space): ");
        String n = variabel.nextLine();
        return n;
    }

    public int maxPassInOneBus() {
        return 4;
    }

    public void printResult() {
        String[] totalEachMemberFams = totalEachMemberOfFamily().split(" ");
        if (totalFamily() == totalEachMemberFams.length) {
            int count = 0;
            for (int i = 0; i < totalEachMemberFams.length; i++) {
                count += Integer.parseInt(totalEachMemberFams[i]);
            }
            if (count % maxPassInOneBus() != 0) {
                System.out.print("Minimum bus required is: ");
                System.out.printf("%d", count / maxPassInOneBus() + 1);
            } else {
                System.out.print("Minimum bus required is: ");
                System.out.printf("%d", count / maxPassInOneBus());
            }
        } else {
            System.out.println("Input must be equal to count family");
        }
    }

    public static void main(String[] args) {
        Logic2Revised2 result = new Logic2Revised2();
        result.printResult();
    }

}

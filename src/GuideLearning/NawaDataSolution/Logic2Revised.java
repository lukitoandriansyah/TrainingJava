package GuideLearning.NawaDataSolution;

import java.util.Scanner;

public class Logic2Revised {
    Scanner variabel = new Scanner(System.in);

    public int totalFamily() {
        System.out.print("Total of Family: ");
        int m = variabel.nextInt();
        return m;
    }

    public String totalEachMemberOfFamily() {
        System.out.print("Total member of each Family: ");
        String n = variabel.nextLine();
        return n;
    }

    public int maxPassInOneBus() {
        return 4;
    }

    public void printResult() {

        String[] totalEachMemberFams = totalEachMemberOfFamily().split(" ");
        int length = totalEachMemberFams.length;

        if (totalFamily() == length) {
            int count = 0;
            System.out.print("Total of each member is :");
            for (int i = 0; i < length; i++) {
                System.out.printf("%3d", Integer.parseInt(totalEachMemberFams[i]));
            }
            System.out.println();

            for (int i = 0; i < length; i++) {
                count = count + Integer.parseInt(totalEachMemberFams[i]);
            }

            System.out.print("Total all member is :");
            System.out.printf("%3d", count);

            if (count % maxPassInOneBus() != 0) {
                System.out.print("Minimum bus have must be rent is: ");
                System.out.printf("%3d", count / maxPassInOneBus() + 1);
            } else {
                System.out.print("Minimum bus have must be rent is: ");
                System.out.printf("%3d", count / maxPassInOneBus());
            }
        } else {
            System.out.println("Input must be equal to count family");
        }
    }

    public static void main(String[] args) {
        Logic2Revised result = new Logic2Revised();
        result.printResult();
    }

}

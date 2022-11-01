package GuideLearning.LukitoAndriansyah;

import java.util.Scanner;

public class Logic2PembatasanSosialBerskalaBsear {
    Scanner variabel = new Scanner(System.in);

    public String totalFamily() {
        System.out.print("Input the number of families : ");
        int m = variabel.nextInt();
        return String.valueOf(m);
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
        //String[] totalEachMemberFams = totalEachMemberOfFamily().split(" ");
        if (Integer.parseInt(totalFamily()) == totalEachMemberOfFamily().split(" ").length) {
            int count = 0;
            int count2=0;
            for (int i = 0; i < totalEachMemberOfFamily().split(" ").length; i++) {
                count += Integer.parseInt(totalEachMemberOfFamily().split(" ")[i]);
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
        Logic2PembatasanSosialBerskalaBsear result = new Logic2PembatasanSosialBerskalaBsear();
        result.printResult();
    }

}

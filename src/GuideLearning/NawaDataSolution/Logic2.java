package GuideLearning.NawaDataSolution;

import java.util.ArrayList;
import java.util.Scanner;

public class Logic2 {
    Scanner variabel = new Scanner(System.in);

    public int totalFamily() {
        System.out.print("Total of Family: ");
        int n = variabel.nextInt();
        return n;
    }

    public int[] totalMemberEachFamsFrame(){
        int n = totalFamily();
        int[] memberEachFams = new int[n];
        fillTotalMemberEachFamsFrame(memberEachFams);
        return memberEachFams;
    }

    public void fillTotalMemberEachFamsFrame(int[] memberEachFams){
        for(int i = 0; i< memberEachFams.length; i++){
            System.out.printf("%3s", "Total member of family no. "+ (i+1) +" : ");
            memberEachFams[i] = variabel.nextInt();
        }
        System.out.println();
    }

    public int maxPassInOneBus(){
        //int n = 4;
        return 4;
    }

    public void printResult(){
        int count = 0;
        int[] memberFamsArr = totalMemberEachFamsFrame();
        ArrayList busDistribute = new ArrayList();
        System.out.print("Total of each member is :");
        for(int i = 0 ; i< memberFamsArr.length; i++){
            System.out.printf("%3d", memberFamsArr[i]);
        }
        System.out.println();

        for (int i = 0; i< memberFamsArr.length; i++){
            count = count + memberFamsArr[i];
        }

        System.out.print("Total all member is :");
        System.out.printf("%3d", count);
        //System.out.printf("%3d", count/maxPassInOneBus());

        if(count%maxPassInOneBus() !=0){
            System.out.print("Minimum bus have must be rent is: ");
            System.out.printf("%3d", count/maxPassInOneBus() + 1);
        }else{
            System.out.print("Minimum bus have must be rent is: ");
            System.out.printf("%3d", count/maxPassInOneBus());
        }
    }

    public static void main(String[] args) {
        Logic2 result = new Logic2();
        result.printResult();
    }

}

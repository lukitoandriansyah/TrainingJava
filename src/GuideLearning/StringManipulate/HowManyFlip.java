package GuideLearning.StringManipulate;

import java.util.ArrayList;
import java.util.Scanner;

public class HowManyFlip {

    public static String HowMany(String[] input){
        ArrayList<String> inputHasChecker = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i<input[0].split("").length; i++){
            if(input[0].split("").length == input[1].split("").length){
                if(input[0].split("")[i].equals("0") || input[0].split("")[i].equals("1") ){
                    if(input[1].split("")[i].equals("0") || input[1].split("")[i].equals("1") ){
                        inputHasChecker.add(input[0].split("")[i]);
                    }else {
                        inputHasChecker.add("Error! Please insert target only contain 1 or 0");
                        return inputHasChecker.get(0);
                    }
                }else {
                    inputHasChecker.add("Error! Please insert input only contain 1 or 0");
                    return inputHasChecker.get(0);
                }
            }else{
                inputHasChecker.add("Error! length input and target must be same");
                return inputHasChecker.get(0);
            }
        }

        for (int i = 0; i<input[0].split("").length; i++){
            if(!(input[0].split("")[i].equals(input[1].split("")[i]))){
                for(int j=i;j<input[0].split("").length;j++){
                    if(input[0].split("")[j].equals("0")){
                        input[0].split("")[j]="1";

                    }
                    else {
                        input[0].split("")[j]="0";
                    }
                }
                counter=counter+1;
            }
        }

        input[0]= String.valueOf(counter);


        return "count flip: "+ input[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        String input = scanner.nextLine();
        System.out.print("target: ");
        String target = scanner.nextLine();
        String[] arrInput = new String[2];
        arrInput[0] = input;
        arrInput[1] = target;
        System.out.println(HowMany(arrInput));
    }
}

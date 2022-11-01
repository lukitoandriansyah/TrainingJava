package GuideLearning.StringManipulate;

import java.util.ArrayList;
import java.util.Scanner;

public class HowManyDuplicate {

    public static String HowMany(String[] input){

        ArrayList<String> inputChecker = new ArrayList<>();
        ArrayList<Integer> valueDuplicate = new ArrayList<>();
        String[] counter = new String[2];
        counter[1]= String.valueOf(0);
        for (int i=0; i<input.length; i++){
            if(inputChecker.size()==0){
                inputChecker.add(input[i]);
                valueDuplicate.add(0);
            }else {
                if(inputChecker.contains(input[i])){
                    counter[0]= String.valueOf(1);
                    if(counter[1].equals("0")){
                        counter[1].equals("1");
                    }else {
                        if(input[i+1]==input[i]){
                            counter[1]=String.valueOf(Integer.parseInt(counter[1])+1);
                        }
                    }
                }else {
                    inputChecker.add(input[i]);
                }
            }
        }
        return input[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[1];
        input[0] = scanner.nextLine();
        System.out.println(HowMany(input));

    }
}

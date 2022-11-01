package GuideLearning.StringManipulate;
import java.util.Scanner;

public class HowManyCharDiffrence {

    public static String StringManipulateChallenge(String[] arrStr) {
        StringBuilder str = new StringBuilder();
        int counter = 0;

        for (String element : arrStr) {
            if (!element.equals("{") && !element.equals(" ") && !element.equals("}")) {
                str.append(element);
            }
        }

        String[] arrStrToken = str.toString().split(",");

        if(arrStrToken[0].length()==arrStrToken[1].length()){
            for(int i=0; i<arrStrToken[0].length(); i++){
                if(!(arrStrToken[0].split("")[i].equals(arrStrToken[1].split("")[i]))){
                    counter +=1;
                }
            }
        }

        return String.valueOf(counter);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(StringManipulateChallenge(s.nextLine().split("")));
    }
}
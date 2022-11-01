package GuideLearning.TokenManipulate;

import java.util.*;

public class Main {

    static String token = "fiqmzb5a";

    public static String ArrToken(String[] arrToken) {
        StringBuilder strToken = new StringBuilder();
        StringBuilder strToken1 = new StringBuilder();
        for (String element : arrToken) {
            if (!element.equals("{") && !element.equals(" ") && !element.equals("}")) {
                strToken.append(element);
            }
        }

        String[] arrStrToken = strToken.toString().split(",");
        for (String item : arrStrToken) {
            strToken1.append(item);
        }

        String[] arrStrToken1 = strToken1.toString().split("");
        StringBuilder strToken21 = new StringBuilder();
        StringBuilder strToken22 = new StringBuilder();
        int indexSeparated = 0;
        for (int i = 0; i < arrStrToken1.length; i++) {
            if (arrStrToken1[i].equals(arrStrToken1[0])) {
                if (i + 1 < arrStrToken1.length) {
                    if (arrStrToken1[i + 1].equals(arrStrToken1[0])) {
                        indexSeparated = indexSeparated + i;
                        for (int j = 0; j < indexSeparated + 1; j++) {
                            strToken21.append(arrStrToken1[j]);
                        }

                        for (int k = indexSeparated + 1; k < arrStrToken1.length; k++) {
                            strToken22.append(arrStrToken1[k]);
                        }
                    }
                }
            }
        }

        StringBuilder strToken2 = new StringBuilder();
        String[] nerArr1 = strToken21.substring(1, strToken21.length() - 1).split("");
        String[] nerArr2 = strToken22.substring(1, strToken22.length() - 1).split("");
        ArrayList<String> finalArr = new ArrayList<>();
        for (String value : nerArr1) {
            for (String s : nerArr2) {
                if (value.equals(s)) {
                    finalArr.add(s);
                }
            }
        }

        Collections.sort(finalArr);

        for (String s : finalArr) {
            strToken2.append(s).append(",");
        }

        String strTokenConcat = strToken2.substring(0, strToken2.length() - 1) + token;
        String[] finalArrayRaw = strTokenConcat.split("");
        StringBuilder tokenDoneRaw = new StringBuilder();
        for (String s : finalArrayRaw) {
            tokenDoneRaw.append(s);
        }

        String[] finalArray = tokenDoneRaw.toString().split("");
        StringBuilder tokenDone = new StringBuilder();
        for (int i = 0; i < finalArray.length; i++) {
            if ((i + 1) % 4 == 0) {
                tokenDone.append("_");
            } else {
                tokenDone.append(finalArray[i]);
            }
        }


        String[] arrTokenDone = new String[1];
        arrTokenDone[0] = tokenDone.toString();


        return arrTokenDone[0];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(ArrToken(s.nextLine().split("")));
    }
}

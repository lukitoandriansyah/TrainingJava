package VowelAndConsonantSorter.Consonant;

public class ArrayConsonant extends ConsonantCounter {
    public String arrConsonantInput(String paramCounter, String paramVowel) {
        String[] arrInput = paramVowel.split("");
        String arrConsonant = "";
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].toLowerCase().equals("b")) {
                for (int j = 0; j < counterB(paramCounter); j++) {
                    arrConsonant += "b";
                }
            }
            if (arrInput[i].toLowerCase().equals("c")) {
                for (int j = 0; j < counterC(paramCounter); j++) {
                    arrConsonant += "c";
                }
            }
            if (arrInput[i].toLowerCase().equals("d")) {
                for (int j = 0; j < counterD(paramCounter); j++) {
                    arrConsonant += "d";
                }
            }
            if (arrInput[i].toLowerCase().equals("f")) {
                for (int j = 0; j < counterF(paramCounter); j++) {
                    arrConsonant += "f";
                }
            }
            if (arrInput[i].toLowerCase().equals("g")) {
                for (int j = 0; j < counterG(paramCounter); j++) {
                    arrConsonant += "g";
                }
            }
            if (arrInput[i].toLowerCase().equals("h")) {
                for (int j = 0; j < counterH(paramCounter); j++) {
                    arrConsonant += "h";
                }
            }
            if (arrInput[i].toLowerCase().equals("j")) {
                for (int j = 0; j < counterJ(paramCounter); j++) {
                    arrConsonant += "j";
                }
            }
            if (arrInput[i].toLowerCase().equals("k")) {
                for (int j = 0; j < counterK(paramCounter); j++) {
                    arrConsonant += "k";
                }
            }
            if (arrInput[i].toLowerCase().equals("l")) {
                for (int j = 0; j < counterL(paramCounter); j++) {
                    arrConsonant += "l";
                }
            }
            if (arrInput[i].toLowerCase().equals("m")) {
                for (int j = 0; j < counterG(paramCounter); j++) {
                    arrConsonant += "m";
                }
            }
            if (arrInput[i].toLowerCase().equals("n")) {
                for (int j = 0; j < counterN(paramCounter); j++) {
                    arrConsonant += "n";
                }
            }
            if (arrInput[i].toLowerCase().equals("p")) {
                for (int j = 0; j < counterP(paramCounter); j++) {
                    arrConsonant += "p";
                }
            }
            if (arrInput[i].toLowerCase().equals("q")) {
                for (int j = 0; j < counterQ(paramCounter); j++) {
                    arrConsonant += "q";
                }
            }
            if (arrInput[i].toLowerCase().equals("r")) {
                for (int j = 0; j < counterR(paramCounter); j++) {
                    arrConsonant += "r";
                }
            }
            if (arrInput[i].toLowerCase().equals("s")) {
                for (int j = 0; j < counterS(paramCounter); j++) {
                    arrConsonant += "s";
                }
            }
            if (arrInput[i].toLowerCase().equals("t")) {
                for (int j = 0; j < counterT(paramCounter); j++) {
                    arrConsonant += "t";
                }
            }
            if (arrInput[i].toLowerCase().equals("v")) {
                for (int j = 0; j < counterV(paramCounter); j++) {
                    arrConsonant += "v";
                }
            }
            if (arrInput[i].toLowerCase().equals("w")) {
                for (int j = 0; j < counterW(paramCounter); j++) {
                    arrConsonant += "w";
                }
            }
            if (arrInput[i].toLowerCase().equals("x")) {
                for (int j = 0; j < counterX(paramCounter); j++) {
                    arrConsonant += "x";
                }
            }
            if (arrInput[i].toLowerCase().equals("y")) {
                for (int j = 0; j < counterY(paramCounter); j++) {
                    arrConsonant += "y";
                }
            }
            if (arrInput[i].toLowerCase().equals("z")) {
                for (int j = 0; j < counterZ(paramCounter); j++) {
                    arrConsonant += "z";
                }
            }
        }
        return arrConsonant;
    }
}
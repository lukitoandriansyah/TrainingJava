package VowelAndConsonantSorter.Consonant;

public class ConsonantArraySout extends ConsonantCounterSout {
    public String arrConsonantInput(String paramCounter, String paramVowel) {
        String[] arrInput = paramVowel.split("");
        StringBuilder arrConsonant = new StringBuilder();
        for (String s : arrInput) {
            if (s.equalsIgnoreCase("b")) {
                arrConsonant.append("b".repeat(Math.max(0, counterB(paramCounter))));
            }
            if (s.equalsIgnoreCase("c")) {
                arrConsonant.append("c".repeat(Math.max(0, counterC(paramCounter))));
            }
            if (s.equalsIgnoreCase("d")) {
                arrConsonant.append("d".repeat(Math.max(0, counterD(paramCounter))));
            }
            if (s.equalsIgnoreCase("f")) {
                arrConsonant.append("f".repeat(Math.max(0, counterF(paramCounter))));
            }
            if (s.equalsIgnoreCase("g")) {
                arrConsonant.append("g".repeat(Math.max(0, counterG(paramCounter))));
            }
            if (s.equalsIgnoreCase("h")) {
                arrConsonant.append("h".repeat(Math.max(0, counterH(paramCounter))));
            }
            if (s.equalsIgnoreCase("j")) {
                arrConsonant.append("j".repeat(Math.max(0, counterJ(paramCounter))));
            }
            if (s.equalsIgnoreCase("k")) {
                arrConsonant.append("k".repeat(Math.max(0, counterK(paramCounter))));
            }
            if (s.equalsIgnoreCase("l")) {
                arrConsonant.append("l".repeat(Math.max(0, counterL(paramCounter))));
            }
            if (s.equalsIgnoreCase("m")) {
                arrConsonant.append("m".repeat(Math.max(0, counterM(paramCounter))));
            }
            if (s.equalsIgnoreCase("n")) {
                arrConsonant.append("n".repeat(Math.max(0, counterN(paramCounter))));
            }
            if (s.equalsIgnoreCase("p")) {
                arrConsonant.append("p".repeat(Math.max(0, counterP(paramCounter))));
            }
            if (s.equalsIgnoreCase("q")) {
                arrConsonant.append("q".repeat(Math.max(0, counterQ(paramCounter))));
            }
            if (s.equalsIgnoreCase("r")) {
                arrConsonant.append("r".repeat(Math.max(0, counterR(paramCounter))));
            }
            if (s.equalsIgnoreCase("s")) {
                arrConsonant.append("s".repeat(Math.max(0, counterS(paramCounter))));
            }
            if (s.equalsIgnoreCase("t")) {
                arrConsonant.append("t".repeat(Math.max(0, counterT(paramCounter))));
            }
            if (s.equalsIgnoreCase("v")) {
                arrConsonant.append("v".repeat(Math.max(0, counterV(paramCounter))));
            }
            if (s.equalsIgnoreCase("w")) {
                arrConsonant.append("w".repeat(Math.max(0, counterW(paramCounter))));
            }
            if (s.equalsIgnoreCase("x")) {
                arrConsonant.append("x".repeat(Math.max(0, counterX(paramCounter))));
            }
            if (s.equalsIgnoreCase("y")) {
                arrConsonant.append("y".repeat(Math.max(0, counterY(paramCounter))));
            }
            if (s.equalsIgnoreCase("z")) {
                arrConsonant.append("z".repeat(Math.max(0, counterZ(paramCounter))));
            }
        }
        return arrConsonant.toString();
    }
}
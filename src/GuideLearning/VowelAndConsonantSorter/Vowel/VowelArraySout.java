package GuideLearning.VowelAndConsonantSorter.Vowel;

public class VowelArraySout extends VowelCounterSout {
    public String arrVowelInput(String paramCounter, String paramVowel) {
        String[] arrInput = paramVowel.split("");
        StringBuilder arrVowel = new StringBuilder();
        for (String s : arrInput) {
            if (s.equalsIgnoreCase("a")) {
                arrVowel.append("a".repeat(Math.max(0, counterA(paramCounter))));
            }
            if (s.equalsIgnoreCase("i")) {
                arrVowel.append("i".repeat(Math.max(0, counterI(paramCounter))));
            }
            if (s.equalsIgnoreCase("u")) {
                arrVowel.append("u".repeat(Math.max(0, counterU(paramCounter))));
            }
            if (s.equalsIgnoreCase("e")) {
                arrVowel.append("e".repeat(Math.max(0, counterE(paramCounter))));
            }
            if (s.equalsIgnoreCase("o")) {
                arrVowel.append("o".repeat(Math.max(0, counterO(paramCounter))));
            }
        }
        return arrVowel.toString();
    }
}

package VowelAndConsonantSorter.Vowel;

public class ArrayVowel extends VowelCounter {
    public String arrVowelInput(String paramCounter, String paramVowel) {
        String[] arrInput = paramVowel.split("");
        String arrVowel = "";
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].toLowerCase().equals("a")) {
                for (int j = 0; j < counterA(paramCounter); j++) {
                    arrVowel += "a";
                }
            }
            if (arrInput[i].toLowerCase().equals("i")) {
                for (int j = 0; j < counterI(paramCounter); j++) {
                    arrVowel += "i";
                }
            }
            if (arrInput[i].toLowerCase().equals("u")) {
                for (int j = 0; j < counterU(paramCounter); j++) {
                    arrVowel += "u";
                }
            }
            if (arrInput[i].toLowerCase().equals("e")) {
                for (int j = 0; j < counterE(paramCounter); j++) {
                    arrVowel += "e";
                }
            }
            if (arrInput[i].toLowerCase().equals("o")) {
                for (int j = 0; j < counterO(paramCounter); j++) {
                    arrVowel += "o";
                }
            }
        }
        return arrVowel;
    }
}

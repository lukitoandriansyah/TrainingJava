package VowelAndConsonantSorter.Vowel;

public class VowelCounter extends SoutVowel {
    public int counterA(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].toLowerCase().equals("a")) {
                count = count + 1;
            }
        }
        return count;
    }

    public int counterI(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].toLowerCase().equals("i")) {
                count = count + 1;
            }
        }
        return count;
    }

    public int counterU(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].toLowerCase().equals("u")) {
                count = count + 1;
            }
        }
        return count;
    }

    public int counterE(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].toLowerCase().equals("e")) {
                count = count + 1;
            }
        }
        return count;
    }

    public int counterO(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].toLowerCase().equals("o")) {
                count = count + 1;
            }
        }
        return count;
    }
}

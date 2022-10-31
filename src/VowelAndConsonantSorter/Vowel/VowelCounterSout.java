package VowelAndConsonantSorter.Vowel;

public class VowelCounterSout extends VowelSout {
    public int counterA(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (String s : arrInput) {
            if (s.equalsIgnoreCase("a")) {
                count = count + 1;
            }
        }
        return count;
    }

    public int counterI(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (String s : arrInput) {
            if (s.equalsIgnoreCase("i")) {
                count = count + 1;
            }
        }
        return count;
    }

    public int counterU(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (String s : arrInput) {
            if (s.equalsIgnoreCase("u")) {
                count = count + 1;
            }
        }
        return count;
    }

    public int counterE(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (String s : arrInput) {
            if (s.equalsIgnoreCase("e")) {
                count = count + 1;
            }
        }
        return count;
    }

    public int counterO(String param) {
        String[] arrInput = param.split("");
        int count = 0;
        for (String s : arrInput) {
            if (s.equalsIgnoreCase("o")) {
                count = count + 1;
            }
        }
        return count;
    }
}

package VowelSorter;

import java.util.*;

public class Main {

    Scanner var = new Scanner(System.in);

    public String input() {
        String input = var.nextLine();
        return input;
    }

    public void arrInput(String input) {
        String[] arrInput = input.split("");
        String inputManipulate = "";
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].toLowerCase().equals("a") || arrInput[i].toLowerCase().equals("i") || arrInput[i].toLowerCase().equals("u") || arrInput[i].toLowerCase().equals("e") || arrInput[i].toLowerCase().equals("o")) {
                inputManipulate += arrInput[i].toLowerCase();
            }
        }
        ArrayList<String> arrInputManipulate = new ArrayList<>();
        arrInputManipulate.add(inputManipulate);

        ArrayList<String> checkingNoDouble = new ArrayList<>();

        for (int i = 0; i < inputManipulate.split("").length; i++) {
            if (!checkingNoDouble.contains(inputManipulate.split("")[i])) {
                checkingNoDouble.add(inputManipulate.split("")[i]);
            }
        }

        String setInputManipulate = "";

        for (int i = 0; i < checkingNoDouble.size(); i++) {
            setInputManipulate += checkingNoDouble.get(i);
        }

        ArrayList<String> setArrInputManipulateConverted = new ArrayList<>();
        setArrInputManipulateConverted.add(setInputManipulate);

        counterA(arrInputManipulate.get(0));
        counterI(arrInputManipulate.get(0));
        counterU(arrInputManipulate.get(0));
        counterE(arrInputManipulate.get(0));
        counterO(arrInputManipulate.get(0));
        arrVowelInput(arrInputManipulate.get(0),setArrInputManipulateConverted.get(0));
        System.out.println(arrVowelInput(arrInputManipulate.get(0),setArrInputManipulateConverted.get(0)));
    }

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

    public static void main(String[] args) {
        Main s = new Main();
        s.arrInput(s.input());
    }
}

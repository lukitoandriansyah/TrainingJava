package GuideLearning.VowelAndConsonantSorter.Vowel;

import GuideLearning.VowelAndConsonantSorter.Input;

import java.util.ArrayList;

public class VowelSout extends Input {
    public void soutArrVowelInput(String input) {
        String[] arrInput = input.split("");
        StringBuilder inputManipulate = new StringBuilder();
        for (String value : arrInput) {
            if (value.equalsIgnoreCase("a") || value.equalsIgnoreCase("i") || value.equalsIgnoreCase("u") || value.equalsIgnoreCase("e") || value.equalsIgnoreCase("o")) {
                inputManipulate.append(value.toLowerCase());
            }
        }

        ArrayList<String> arrInputManipulate = new ArrayList<>();
        arrInputManipulate.add(inputManipulate.toString());

        ArrayList<String> checkingNoDouble = new ArrayList<>();

        for (int i = 0; i < inputManipulate.toString().split("").length; i++) {
            if (!checkingNoDouble.contains(inputManipulate.toString().split("")[i])) {
                checkingNoDouble.add(inputManipulate.toString().split("")[i]);
            }
        }

        StringBuilder setInputManipulate = new StringBuilder();

        for (String value : checkingNoDouble) {
            setInputManipulate.append(value);
        }

        ArrayList<String> setArrInputManipulateConverted = new ArrayList<>();
        setArrInputManipulateConverted.add(setInputManipulate.toString());

        VowelCounterSout s = new VowelCounterSout();
        VowelArraySout av = new VowelArraySout();

        s.counterA(arrInputManipulate.get(0));
        s.counterI(arrInputManipulate.get(0));
        s.counterU(arrInputManipulate.get(0));
        s.counterE(arrInputManipulate.get(0));
        s.counterO(arrInputManipulate.get(0));

        av.arrVowelInput(arrInputManipulate.get(0),setArrInputManipulateConverted.get(0));
        System.out.print("Vowel Char: ");
        System.out.println(av.arrVowelInput(arrInputManipulate.get(0),setArrInputManipulateConverted.get(0)));
    }
}

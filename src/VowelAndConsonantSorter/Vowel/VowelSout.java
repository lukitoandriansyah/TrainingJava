package VowelAndConsonantSorter.Vowel;

import VowelAndConsonantSorter.Input;

import java.util.ArrayList;

public class SoutVowel extends Input {
    public void soutArrVowelInput(String input) {
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

        VowelCounter s = new VowelCounter();
        ArrayVowel av = new ArrayVowel();

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

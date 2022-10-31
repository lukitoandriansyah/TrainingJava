package VowelAndConsonantSorter.Consonant;

import VowelAndConsonantSorter.Input;

import java.util.ArrayList;

public class ConsonantSout extends Input {
    public void soutArrConsonantInput(String input) {
        String[] arrInput = input.split("");
        StringBuilder inputManipulate = new StringBuilder();
        for (String value : arrInput) {
            if (!(value.equalsIgnoreCase("a") || value.equalsIgnoreCase("i") || value.equalsIgnoreCase("u") || value.equalsIgnoreCase("e") || value.equalsIgnoreCase("o"))) {
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

        ConsonantCounterSout s = new ConsonantCounterSout();
        ConsonantArraySout ac = new ConsonantArraySout();

        s.counterB(arrInputManipulate.get(0));
        s.counterC(arrInputManipulate.get(0));
        s.counterD(arrInputManipulate.get(0));
        s.counterF(arrInputManipulate.get(0));
        s.counterG(arrInputManipulate.get(0));
        s.counterH(arrInputManipulate.get(0));
        s.counterJ(arrInputManipulate.get(0));
        s.counterK(arrInputManipulate.get(0));
        s.counterL(arrInputManipulate.get(0));
        s.counterM(arrInputManipulate.get(0));
        s.counterN(arrInputManipulate.get(0));
        s.counterP(arrInputManipulate.get(0));
        s.counterQ(arrInputManipulate.get(0));
        s.counterR(arrInputManipulate.get(0));
        s.counterS(arrInputManipulate.get(0));
        s.counterT(arrInputManipulate.get(0));
        s.counterV(arrInputManipulate.get(0));
        s.counterW(arrInputManipulate.get(0));
        s.counterX(arrInputManipulate.get(0));
        s.counterY(arrInputManipulate.get(0));
        s.counterZ(arrInputManipulate.get(0));

        ac.arrConsonantInput(arrInputManipulate.get(0),setArrInputManipulateConverted.get(0));
        System.out.print("Consonant Char: ");
        System.out.println(ac.arrConsonantInput(arrInputManipulate.get(0),setArrInputManipulateConverted.get(0)));
    }
}

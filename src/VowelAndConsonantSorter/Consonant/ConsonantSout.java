package VowelAndConsonantSorter.Consonant;

import VowelAndConsonantSorter.Input;

import java.util.ArrayList;

public class SoutConsonant extends Input {
    public void soutArrConsonantInput(String input) {
        String[] arrInput = input.split("");
        String inputManipulate = "";
        for (int i = 0; i < arrInput.length; i++) {
            if (!(arrInput[i].toLowerCase().equals("a") || arrInput[i].toLowerCase().equals("i") || arrInput[i].toLowerCase().equals("u") || arrInput[i].toLowerCase().equals("e") || arrInput[i].toLowerCase().equals("o"))) {
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

        ConsonantCounter s = new ConsonantCounter();
        ArrayConsonant ac = new ArrayConsonant();

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

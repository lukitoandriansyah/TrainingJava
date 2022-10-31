package VowelAndConsonantSorter;


import VowelAndConsonantSorter.Consonant.ConsonantSout;
import VowelAndConsonantSorter.Vowel.VowelSout;

public class SorterSout extends Input {
    public void soutArrInput(String input){
        ConsonantSout sc = new ConsonantSout();
        VowelSout sv = new VowelSout();

        sc.soutArrConsonantInput(input);
        sv.soutArrVowelInput(input);
    }
}

package VowelAndConsonantSorter;


import VowelAndConsonantSorter.Consonant.SoutConsonant;
import VowelAndConsonantSorter.Vowel.SoutVowel;

public class SoutSorter extends Input {
    public void soutArrInput(String input){
        SoutConsonant sc = new SoutConsonant();
        SoutVowel sv = new SoutVowel();

        sc.soutArrConsonantInput(input);
        sv.soutArrVowelInput(input);
    }
}

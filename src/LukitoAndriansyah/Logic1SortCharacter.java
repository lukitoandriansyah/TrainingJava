package NawaDataSolution;

import java.util.Scanner;

public class Logic1 {
    Scanner variabel = new Scanner(System.in);

    public String[] inputWordToArr() {
        System.out.print("Input one line of word(S): ");
        String word = variabel.nextLine().toLowerCase();
        String[] wordArr = word.split("");
        return wordArr;
    }
    public void printInputWordToArr() {
        String[] wordArr = inputWordToArr();
        System.out.println("Vowel Characters : ");
        for (int i = 0; i < wordArr.length; i++) {
            if (!(wordArr[i].equals(" ")) && (wordArr[i].equals("a") || wordArr[i].equals("i") || wordArr[i].equals("u") || wordArr[i].equals("e") || wordArr[i].equals("o"))) {
                System.out.printf("%s", wordArr[i]);
            }
        }

        System.out.println();

        System.out.println("Consonant Characters : ");
        for (int i = 0; i < wordArr.length; i++) {
            if (!(wordArr[i].equals(" ")) && !(wordArr[i].equals("a") || wordArr[i].equals("i") || wordArr[i].equals("u") || wordArr[i].equals("e") || wordArr[i].equals("o"))) {
                System.out.printf("%s", wordArr[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Logic1 hasil = new Logic1();
        hasil.printInputWordToArr();
    }

}

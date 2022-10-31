package VowelAndConsonantSorter;

import java.util.Scanner;

public class Input {
    Scanner var = new Scanner(System.in);

    public String input() {
        System.out.print("Input Your Words: ");
        return var.nextLine();
    }
}

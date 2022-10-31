package TestHrAi.AnimalAb;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AnimalAbillity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine();
            Parrot p = new Parrot();
            if (name.equals("eat")) {
                p.eat();
            }
            if (name.equals("makeSound")) {
                p.makeSound();
            }
            if (name.equals("fly")) {
                p.fly();
            }
        }
    }
}

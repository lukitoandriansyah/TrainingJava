package SelfLearning.ClassAndObject.HR.Nov2022.Day1.TimeConversion;

import java.io.*;
import java.util.Scanner;

public class TimeConversionMain {
    public static void main(String[] args) throws IOException {
        /*BufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }*/

        Scanner scanner = new Scanner(System.in);
        TimeConversion timeConversion = new TimeConversion();
        System.out.println(timeConversion.timeConversion(scanner.nextLine()));
    }
}

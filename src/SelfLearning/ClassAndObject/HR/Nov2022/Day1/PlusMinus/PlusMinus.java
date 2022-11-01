package SelfLearning.ClassAndObject.HR.Nov2022.Day1.PlusMinus;

import java.util.*;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        double counterMin = 0;
        double counterPlus = 0;
        double counterZero = 0;

        for (Integer integer : arr) {
            if (integer < 0) {
                counterMin++;
            }
            if (integer > 0) {
                counterPlus++;
            }
            if (integer == 0) {
                counterZero++;
            }
        }


        double cMin = Math.round((counterMin / arr.size()) * 1000000.0) / 1000000.0;
        double cPlus = Math.round((counterPlus / arr.size()) * 1000000.0) / 1000000.0;
        double cZero = Math.round((counterZero / arr.size()) * 1000000.0) / 1000000.0;

        double[] listCounter = new double[3];
        listCounter[0] = cPlus;
        listCounter[1] = cMin;
        listCounter[2] = cZero;

        for (double v : listCounter) {
            System.out.println(v);
        }

    }

}

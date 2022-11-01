package SelfLearning.ClassAndObject.HR.Nov2022.Day1.MinMaxSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        ArrayList<Long> listInt= new ArrayList<>();
        long counter = 0;

        for(int i = 0; i<arr.size();i++){
            for(int j=0; j<arr.size();j++){
                if(i!=j){
                    counter = counter + Long.valueOf(arr.get(j));
                }
            }
            listInt.add(counter);
            counter = 0;
        }

        Collections.sort(listInt);

        System.out.print(listInt.get(0)+ " ");
        System.out.print(listInt.get(listInt.size()-1));
    }
}

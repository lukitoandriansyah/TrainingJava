package MalamMingguKuy;

import java.util.ArrayList;

public class TrialFPB {
    public static int fpb(int a, int b)
    {
        //if (a == 0)
        //    return b;
        //return fpb(b % a, a);
        int r = a % b;
        while (r != 0)
        {
            b = a;
            a = r;
            r = b % a;
        }
        return a;
    }

    public static int findFPB(ArrayList listInput, ArrayList listPrima)
    {
        //int result = (int) listPrima.get(0);
        //for (int i = 1; i < listPrima.size(); i++)
        //    result = fpb((Integer) listInput.get(i), result);

        //return result;

        int result = (Integer) listInput.get(0);
        for (int i = 1; i < listPrima.size(); i++)
            result = fpb((Integer) listInput.get(i), result);

        return result;
    }
}

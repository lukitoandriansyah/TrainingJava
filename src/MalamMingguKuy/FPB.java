package MalamMingguKuy;

public class FPB {
    public static int fpb(int a, int b)
    {
        if (a == 0)
            return b;
        return fpb(b % a, b);
    }

    public static int findFPB(int[] arr, int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = fpb(arr[i], result);

        return result;
    }
}

package GuideLearning.MalamMingguKuy;

import java.util.Vector;

public class KPK {
    public static long findKPK(int arr[], int n) {
        int max_num = 0;
        for (int i = 0; i < n; i++) {
            if (max_num < arr[i]) {
                max_num = arr[i];
            }
        }
        long res = 1;
        int x = 2;
        while (x <= max_num) {
            Vector<Integer> indexes = new Vector<>();
            for (int j = 0; j < n; j++) {
                if (arr[j] % x == 0) {
                    indexes.add(indexes.size(), j);
                }
            }
            if (indexes.size() >= 2) {
                for (int j = 0; j < indexes.size(); j++) {
                    arr[indexes.get(j)] = arr[indexes.get(j)] / x;
                }
                res = res * x;
            } else {
                x++;
            }
        }
        for (int i = 0; i < n; i++) {
            res = res * arr[i];
        }

        return res;
    }
}
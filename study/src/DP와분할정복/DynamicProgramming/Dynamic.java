package DP와분할정복.DynamicProgramming;

public class Dynamic {
    public int dynamicFuc(int n) {
        int[] data = new int[n + 1];
        data[0] = 0;
        data[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            data[i] = data[i - 1] + data[i - 2];
        }
        return data[n];
    }
}

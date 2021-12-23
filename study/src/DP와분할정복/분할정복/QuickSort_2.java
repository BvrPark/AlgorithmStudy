package DP와분할정복.분할정복;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort_2 {
    public ArrayList<Integer> split(ArrayList<Integer> data) {
        if (data.size() == 1) {
            return data;
        }

        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int pivot = data.get(0);

        for (int i = 1; i < data.size(); i++) {
                if (data.get(i) > data.get(pivot)) {
                    right.add(data.get(i));
                } else {
                    left.add(data.get(i));
                }
            }

        ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(this.split(left));
        merge.addAll(Arrays.asList(pivot));
        merge.addAll(this.split(right));

        return merge;
    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();
        for(int i = 0; i<100;i++) {
            test.add((int) (Math.random() * 100));
        }
        QuickSort_2 Qsort = new QuickSort_2();
        System.out.println(Qsort.split(test));
    }


}

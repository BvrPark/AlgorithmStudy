package 정렬.InsertionSort;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> data) {
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (data.get(j) < data.get(j - 1)){
                    Collections.swap(data, j,j - 1);
                }else{
                    break;
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            test.add((int) (Math.random() * 100));
        }

        InsertionSort iSort = new InsertionSort();
        System.out.println(iSort.sort(test));
    }
}

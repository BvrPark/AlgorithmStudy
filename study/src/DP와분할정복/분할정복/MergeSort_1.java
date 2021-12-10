package DP와분할정복.분할정복;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort_1 {
    public void split(ArrayList<Integer> data){
        if(data.size() <= 1){
            return;
        }
        int half = data.size()/2;

        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        left = new ArrayList<Integer>(data.subList(0,half));
        left = new ArrayList<Integer>(data.subList(half,data.size()));

        System.out.println(left);
        System.out.println(right);
    }

    public static void main(String[] args) {
        MergeSort_1 test = new MergeSort_1();
        test.split(new ArrayList<Integer>(Arrays.asList(7,8,6,2,5,3)));
    }
}

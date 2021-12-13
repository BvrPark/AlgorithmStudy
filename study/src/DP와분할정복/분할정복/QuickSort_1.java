package DP와분할정복.분할정복;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort_1 {
    public void split(ArrayList<Integer> data){
        if(data.size()<=1){
            return ;
        }
        int pivot = data.get(0);

        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        for(int i = 1; i<data.size(); i++){
            if(data.get(i)>pivot){
                right.add(data.get(i));
            }else{
                left.add(data.get(i));
            }
        }

        ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(left);
        merge.addAll(Arrays.asList(pivot));
        merge.addAll(right);
        System.out.println(merge);
    }

}

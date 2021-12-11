package DP와분할정복.분할정복;

import java.util.ArrayList;

public class MergeSort_2 {
    public ArrayList<Integer> Split(ArrayList<Integer> data) {
        if (data.size() <= 1) {
            return data;
        }
        int half = data.size() / 2;

        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        left = Split(new ArrayList<Integer>(data.subList(0, half)));
        right = Split(new ArrayList<Integer>(data.subList(half, data.size())));

        return merge(left, right);

    }

    public ArrayList<Integer> merge(ArrayList<Integer> L_list, ArrayList<Integer> R_list) {
        ArrayList<Integer> m_list = new ArrayList<Integer>();
        int left = 0;
        int right = 0;

        //left,right둘 다 존재
        while (L_list.size() > left && R_list.size() > right) {
            if (L_list.get(left) > R_list.get(right)) {
                m_list.add(R_list.get(right));
                right += 1;
            } else {
                m_list.add(L_list.get(left));
                left += 1;
            }
        }
        //right 데이터가 없을 때
        while (L_list.size() > left) {
            m_list.add(L_list.get(left));
            left += 1;
        }
        //left 데이터가 없을 때
        while(R_list.size() > right){
            m_list.add(R_list.get(right));
            right += 1;
        }
        return m_list;

    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();

        for(int i=0; i<100; i++){
            test.add((int)(Math.random()*100));
        }
        MergeSort_2 sort = new MergeSort_2();
        System.out.println(sort.Split(test));
    }
}

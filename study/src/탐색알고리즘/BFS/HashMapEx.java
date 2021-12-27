package 탐색알고리즘.BFS;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> data1 = new HashMap<String, Integer>();
        HashMap<String, ArrayList<Integer>> data2 = new HashMap<String, ArrayList<Integer>>();
        //데이터 추가
        data1.put("A", 1);
        data1.put("B", 2);
        //데이터 읽기
        System.out.println(data1);
        System.out.println(data1.get("A"));
        //데이터 수정
        data1.put("A", 5);
        System.out.println(data1);
        //데이터 삭제
        data1.remove("B");
        System.out.println(data1);
    }
}

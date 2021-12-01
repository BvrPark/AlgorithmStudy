package BubbleSort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public ArrayList<Integer> bubble(ArrayList<Integer> list) {         //버블정렬 기능을 하는 간단한 메서드 생성
        boolean swap = true;                                            //while문을 조절할 변수 swap생성
        while (swap) {                                                  //특별한 조건이 없으면 무한반복
            int count = 0;                                              //앞뒤데이터가 바뀌었는지 확인하는 변수 count 생성

            //인접한 두 데이터를 비교해서 앞의 데이터가 더 컸을 때 앞,뒤 데이터의 위치를 바꾸는 반복문 생성
            for (int index = 0; index < list.size() - 1; index++) {
                if (list.get(index) > list.get(index + 1)) {
                    Collections.swap(list, index,index + 1);
                    ++count;                                            //데이터 위치를 바꿨을때, count증가
                }
            }//for문 종료
            if (count == 0) {   //만약 count가 안올라갔을 때 while문을 종료
                swap = false;
            }
        }//while문 종료
        return list;        //bubble메서드의 리턴값으로 list
    }

    public static void main(String[] args) {
        BubbleSort bSort = new BubbleSort();
        ArrayList<Integer> test = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {                  //무작위의 난수를 설정해서 ArrayList에 넣는 반복문 생성
            test.add((int) (Math.random() * 100));
        }
        System.out.println(bSort.bubble(test));         //버블정렬 적용한 결과 출력
    }
}

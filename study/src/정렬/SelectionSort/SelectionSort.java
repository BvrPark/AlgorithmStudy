package 정렬.SelectionSort;

import java.util.*;

public class SelectionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList){        //선택정렬 기능을 하는 메서드 생성
        int low;                                                        //최소값의 인덱스를 담을 low생성
        for (int i = 0; i < dataList.size() - 1; i++) {                 //인덱스 0부터 비교를 시작하는 반복문 생성
            low = i;                                                    //일단 low인덱스를 제일 앞의 인덱스로 둔다.
            for (int index = i + 1; index < dataList.size(); index++) { //low인덱스 바로 뒤부터 끝까지 값을 비교하는 반복문
                if (dataList.get(low) > dataList.get(index)) {      //만약 low값보다 그 뒤의 index값이 더 작으면
                    low = index;                                    //low값을 index값으로 변환
                }
            }
            Collections.swap(dataList,low,i);           //low값과 제일 처음 인덱스 값을 교환시킴
        }
        return dataList;                        //반복이 다 끝난후 저장된 dataList를 반환
    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();     //ArrayList의 객체인 test를 생성

        for(int i = 0; i<20;i++){                   //난수 20개 생성 후 test에 대입
            test.add((int)(Math.random()*100));
        }
        SelectionSort s = new SelectionSort();      //선택정렬의 객체를 만들고
        System.out.println(s.sort(test));           //선택정렬 메서드를 실행해서 난수 20개를 정렬한 값을 출력
    }
}

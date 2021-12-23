package 탐색알고리즘;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch_practice {
    public boolean search(ArrayList<Integer> list, Integer num) {
        int middle = list.size() / 2;   //이진탐색을 위해 중간 index를 middle에 int형으로 넣음
        if (list.size() == 1 && list.get(0) == num) {         //재귀를 반복하다가 마지막 1개의 값만 남았을시 그 값이 num과 같을 경우 true반환
            return true;
        } else if (list.size() == 1 && list.get(0) != num) {   //재귀를 반복하다가 마지막 1개의 값만 남았을시 그 값이 num과 다를 경우 false반환
            return false;
        } else if (list.size() == 0) {                         //만약 list에 아무것도 없을 경우 false반환
            return false;
        }
        //여기부터 본격적으로 이진탐색 시작
        if (num == list.get(middle)) {          //만약 찾는 값과 중간 값이 같다면
            return true;                        //true 반환
        } else if (num < list.get(middle)) {    //찾는 값보다 중간 값이 크면
            return this.search(new ArrayList<Integer>(list.subList(0, middle)), num);   //배열의 처음부터 중간값까지 새로 ArrayList를 만들고 재귀를 이용해 다시 search()를 불러냄
        } else {                                //찾는 값보다 중간 값이 작으면
            return this.search(new ArrayList<Integer>(list.subList(middle, list.size())), num); //배열의 중간부터 끝까지 새로 ArrayList를 만들고 재귀를 이용해 다시 search()를 불러냄
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();         //ArrayList 생성
        for (int i = 0; i < 30; i++) {                              //0~100사이 무작위 30개의 값을 ArrayList에 대입
            test.add((int) (Math.random() * 100));
        }

        Collections.sort(test);     //이진탐색을 사용하기 위하여 ArrayList를 오름차순으로 정렬
        System.out.println(test);   //정렬이 잘 되었는지 확인하기 위하여 한번 출력

        BinarySearch_practice practice = new BinarySearch_practice();   //클래스의 인스턴스 생성
        System.out.println(practice.search(test, 20));             //20이 있는지 search메서드를 이용하여 판단한 것을 출력
    }
}

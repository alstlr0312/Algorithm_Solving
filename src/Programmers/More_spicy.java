package Programmers;
import java.util.*;

public class More_spicy {
    PriorityQueue<Integer> heap = new PriorityQueue<>(); //우선순위 큐 선언
    public int solution(int[] scoville, int K) {
        int answer = 0;

        for (int i = 0; i < scoville.length; i++) {//우선순위 큐에 음식의 스코빌 지수 투입
            heap.add(scoville[i]);
        }

        while(heap.peek() < K) {  //모든 음식이 K이상이 될 때 까지 반복한다. peek()=heap의 첫번 째 값
            int a = heap.poll();  //a=스코빌지수가 가장 낮은거  poll()=heap에 첫번째 값을 반환하고 제거 비어 있으면 null

            int b = heap.poll();  //b=스코빌지수가 두번쨰로 낮은거
            int c = a + b * 2;    //c=a,b 합친 음식의 스코빌 지수

            heap.add(c);          //합친 음식 추가
            answer++;             //횟수 증가
        }
        return answer;
    }

}

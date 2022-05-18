package Programmers;
import java.util.*;
public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int p : priorities){      //queue에 우선순위 입력
            queue.add(p);
        }
        while(true){
            int Big=queue.remove();                 //맨 앞에있는 프린터
            location--;                             //앞에 프린터가 remove되어서 queue안에 배열들이 한칸씩 땡겨졌으므로
                                                    //뽑아야하는 프린터의 위치도 한칸 앞으로 이동
            for(int p : queue){                     //queue 안에 배열들 우선순위 비교

                if(Big<p){                          //맨 앞프린터보다 우선순위가 큰게 있을 경우
                    queue.add(Big);
                }
                else{
                    answer++;
                }
            }
            if(location==-1){
                break;
            }

        }
        return answer;
    }

}


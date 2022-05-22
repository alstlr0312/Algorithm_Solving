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
            boolean biggest = true;                 //우선순위가 가장 큰거 일시 true
            for(int p : queue){                     //queue 안에 배열들 우선순위 비교
                if(Big<p){                          //맨 앞프린터보다 우선순위가 큰게 있을 경우
                    biggest = false;                //가장 우선순위가 높지 않으므로 false
                    break;
                }
            }
            if(biggest == true){                     //프린터를 하나 출력했을 경우
                answer++;                           //횟수 추가
            }
            else{                                   //만일 Big이 우선순위가 가장 높지 않았을 때
                queue.add(Big);                     //맨뒤에 다시 삽입
                if(location==-1){                   //location이 -1 이 되면서 프로그램이 출력 하므로 이경우 구할려는 프린터가
                    //맨뒤로 이동했으므로 location도 배열의 길이만큼 더해줌
                    location += queue.size();
                }
            }
            if(location==-1){                      //구할려는 프린터가 출력됬을때 반복문 정지
                break;
            }

        }
        return answer;
    }

}
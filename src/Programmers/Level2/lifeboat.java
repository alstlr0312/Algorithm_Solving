package Programmers.Level2;
import java.util.Arrays;
public class lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int big=people.length-1;
        int small=0;
        Arrays.sort(people);
        while(big>small){
            if(people[big]+people[small]>limit){
                big--;
                answer++;
            }
            else{
                answer++;
                big--;
                small++;
            }
        }
        return answer; //해피해피
    }
}

package Programmers;
import java.util.Arrays;
public class lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int big=people.length-1;
        int small=0;
        Arrays.sort(people);
        for(int i=0; i<people.length; i++){
            if(people[big]+people[small]>limit){
                big--;
            }
            else{
                answer++;
                big--;
                small++;
            }
        }
        return answer;
    }
}

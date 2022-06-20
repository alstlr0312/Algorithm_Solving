package Programmers.Level1;

public class HaSSad {
    public boolean solution(int x) {
        boolean answer = true;
        int a=x;
        int b=0;  //b는 자리수의 합
        while(a!=0){
            b+=a%10; //자리수를 더해줌
            a/=10;   //다음 자리수로 이동
        }
        if(x%b==0){
            return  answer;
        }
        else
            return false;
    }
}

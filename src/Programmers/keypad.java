package Programmers;
//1 2 3 [0,0] [0,1] [0,2]
//4 5 6 [1,0] [1,1] [1,2]
//7 8 9 [2,0] [2,1] [2,2]
//* 0 # [3,0] [3,1] [3,2]  *=10 0=11 #=12로 위치 표현
public class keypad {
    public String solution(int[] numbers, String hand) {
        int left=10;
        int right=12;
        int i;
        String answer = "";
        for(i=0; i< numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){// 1,4,7은 무조건 왼손을 사용
                answer += "L";
                left = numbers[i];//손 위치 변경
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){//3,6,9는 무조건 오른손 사용
                answer += "R";
                right = numbers[i];//손 위치 변경
            }
            else{//가운데 패드일시..
                // 1 4 7= 왼  3 6 9= 오  2 5 8= 경우에 따라..
                //어...!!!! 키 패드를 이차원 배열로 나타내고 그것을[0,0]->0+0 [0,1]->0+1로 다 더해주면
                //1[0] 2[1] 3[2]
                //4[1] 5[2] 6[3] 이렇게 표현이 가능한데 그러면 만약 오른손은 6에 있고 왼손은 7 그리고 눌러야하는 손이 2이라고 하면
                //7[2] 8[3] 9[4] 오른손과 2의 거리는 2(3-1)이고 왼손은..안되넨ㅋㅋㅋ젠장ㅋㅋ
                //*[3] 0[4] #[5]
            }
        }
        return answer;
    }
}

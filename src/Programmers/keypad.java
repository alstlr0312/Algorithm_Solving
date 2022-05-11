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
                int left_hand=Math.abs((left/3)-(numbers[i]/3))+Math.abs((left%3)-(numbers[i]%3)); //왼손과 가운데 패드와의 거리
                int right_hand=Math.abs((right/3)-(numbers[i]/3))+Math.abs((right%3)-(numbers[i]%3)); //오른손과 가운데 패드와의 거리
                if(left_hand>right_hand){//왼손의 거리가 오른손보다 길때
                    answer += "R";
                    right = numbers[i];
                }
                else if(right_hand>left_hand){//오른손의 거리가 왼손보다 길때
                    answer += "L";
                    left = numbers[i];
                }
                else{
                    if(hand=="left"){//왼손과 오른손의 거리가 같고 왼손 잡이일때
                        answer += "L";
                        left = numbers[i];
                    }
                    else{//왼손과 오른손의 거리가 같고 오른손 잡이 일떋
                        answer += "R";
                        right = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}

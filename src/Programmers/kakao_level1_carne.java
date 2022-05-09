import java.util.Stack;

class kakao_level1_carne {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> bucket = new Stack<>();
        bucket.push(0);
        int answer = 0;//답
        int i;

        for (int move : moves) {//
            for(i=0;i<board.length;i++){
                if(board[i][move-1] != 0 ) {//인형 뽑았을 때
                    if(bucket.peek()==board[i][move-1]){//뽑은 인형이랑 전에 뽑은거랑 같을때
                        bucket.pop();
                        answer+=2;
                    }
                    else{
                        bucket.push(board[i][move-1]);
                    }
                    board[i][move-1]=0; //인형이 뽑힌자리 초기화
                    break;
                }
            }
        }

        return answer*2;
    }


}
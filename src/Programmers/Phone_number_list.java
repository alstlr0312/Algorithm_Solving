package Programmers;
import java.util.HashMap;

public class Phone_number_list {
    public boolean Phone_number_list(String[] phone_book) {
            HashMap<String,Integer> hash = new HashMap<>(); //해쉬맵 생성

            for(int i=0; i< phone_book.length; i++){//전화번호를 해쉬맵에 삽입
                hash.put(phone_book[i], i);
            }

            for(int i=0; i< phone_book.length;i++){//substring이 있는지 확인
                for(int j=0; j< phone_book[i].length();j++){
                    //containsKey=키가 해쉬에 존재하는지 없는지 확인
                    //substring(int beginindex, int endindex)
                    //beginindex=가져올 문자열의 시작 부분을 지정
                    //endindex=문자열의 끝 부분을 지정
                    if(hash.containsKey(phone_book[i].substring(0,j))) {
                        //해쉬맵 안에 phone_book[i]의 substring(0,j)가 존재하는지 확인
                        return false;
                    }
                }
            }
            return true;
    }
}

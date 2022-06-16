package Programmers.Level1;
import java.util.Arrays;
import java.util.HashMap;

public class Phone_number_list {
    public boolean Phone_number_list(String[] phone_book) {
        Arrays.sort(phone_book);//길이에 따라 오름차순으로 정렬
        for(int i=0; i< phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i]))//startsWith(i)은
                return false;
        }
        return true;
    }
}

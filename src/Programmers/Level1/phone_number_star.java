package Programmers.Level1;

public class phone_number_star {
    public String phone_number_star(String phone_number) {
        String answer = "";
        int a= phone_number.length();
        for(int i=0; i<a; i++){
            if(i < a-4){
                answer += "*";
            }
            else{
                answer += phone_number.charAt(i);
            }

        }
        return answer;
    }
}

    package Programmers.Level1;
    import java.util.*;

    public class Report_result {
        public int[] Report_result(String[] id_list, String[] report, int k) {
            int a= id_list.length;
            int[] answer = new int[a];
            HashSet<String> Set = new HashSet<String>();//중복 제거
            HashMap<String,Integer> Map = new HashMap<String,Integer>();//배열을 key와 value로 저장
            int i=0;
            for(String id : id_list){
                Map.put(id,i++); //해시맵에 id_list를 key와 value로 나눠서 저장
            }
            int[] b=new int[a];
            for(String re : report){
                if(Set.contains(re)) //re의 값이 있는지 검색 있으면 계속
                    continue;
                String[] space = re.split(" "); //report의 공백으로 문자열을 나눔
                b[Map.get(space[1])]++; // 신고 당한 사람들을 b에 저장
                Set.add(re); //해쉬set에 신고자와 신고 당한 사람 저장+중복 제거
            }
            for(String se: Set){//
                String[] space = se.split(" ");
                if(b[Map.get(space[1])]>=k){
                    answer[Map.get(space[0])]++;
                }
            }
            return answer;
        }
    }

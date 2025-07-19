import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> solution(String[] strArr) {
        List<String> answer = new ArrayList<>();

        for (String s : strArr) {
            // "ad"라는 부분 문자열을 포함하고 있는지 확인
            if (!s.contains("ad")) {
                // 포함하지 않으면 answer 리스트에 추가
                answer.add(s);
            }
        } 
        
        return answer;
    }
}
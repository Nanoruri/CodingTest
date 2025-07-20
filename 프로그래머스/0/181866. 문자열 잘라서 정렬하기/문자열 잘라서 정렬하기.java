import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String myString) {
        // "x"를 기준으로 공백을 제거하며 문자열을 분리
        String[] words = myString.split("x");
        List<String> answer = new ArrayList<>();



        // 빈 문자열을 제외한 배열 생성
        for (String s : words) {
            if (!s.isEmpty()) {
                answer.add(s);
            }
        }
        // 사전순으로 정렬
        answer.sort(String::compareTo);

        return answer;
    }
}
import java.util.Arrays;
import java.util.List;

public class Solution {


    public List<String> solution(String myStr) {
        List<String> answer = List.of(Arrays.stream(myStr.split("[abc]"))
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new));


        return answer.isEmpty() ? List.of("EMPTY") : answer;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>(arr.length);

        for (int num : arr) {
            if (num >= 50 && num % 2 == 0) {
                answer.add(num / 2);
            } else if (num < 50 && num % 2 == 1) {
                answer.add(num * 2);
            } else {
                answer.add(num);
            }
        }

        return answer;
    }

}
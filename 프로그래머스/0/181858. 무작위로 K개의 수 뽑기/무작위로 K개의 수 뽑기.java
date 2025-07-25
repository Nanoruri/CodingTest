import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        for (int j : arr) {
            if (!answer.contains(j)) {
                answer.add(j);
            }
            if (answer.size() == k) {
                break;
            }
        }

        if (answer.size() < k) {
            for (int i = answer.size(); i < k; i++) {
                answer.add(-1);
            }
        }



        return answer;
    }
}
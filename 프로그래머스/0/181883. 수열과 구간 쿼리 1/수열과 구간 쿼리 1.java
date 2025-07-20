import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>(arr.length);
        for (int j : arr) {
            answer.add(j);
        }

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            for (int j = s; j <= e; j++) {
                answer.set(j, answer.get(j) + 1);
            }
        }

        return answer;
    }
}
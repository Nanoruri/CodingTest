import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];

            if (flag[i]) {
                // flag[i]가 true이면 value를 value * 2번 추가
                for (int j = 0; j < value * 2; j++) {
                    answer.add(value);
                }
            } else {
                // flag[i]가 false이면 뒤에서 value개의 요소 제거
                for (int j = 0; j < value; j++) {
                    if (!answer.isEmpty()) {
                        answer.remove(answer.size() - 1);
                    }
                }
            }
        }

        return answer;
    }
}
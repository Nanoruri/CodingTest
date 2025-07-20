import java.util.ArrayList;
import java.util.List;


class Solution {
   public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>(arr.length);

        // 초기값 복사
        for (int num : arr) {
            answer.add(num);
        }

        // 다음 2의 거듭제곱 수 계산
        int length = arr.length;
        int nextPowerOfTwo = 1;

        while (nextPowerOfTwo < length) {
            nextPowerOfTwo *= 2; // 2의 거듭제곱으로 증가
        }

        // 0 채우기
        for (int i = length; i < nextPowerOfTwo; i++) {
            answer.add(0);
        }

        return answer;
    }
}
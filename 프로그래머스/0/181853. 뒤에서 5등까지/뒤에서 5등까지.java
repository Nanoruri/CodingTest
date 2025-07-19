import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public List<Integer> solution(int[] num_list) {
        // 1. num_list를 오름차순으로 정렬
        Arrays.sort(num_list);
        // 2. 가장 작은 5개의 수를 담을 리스트 생성
        List<Integer> answer = new ArrayList<>();
        // 3. num_list의 처음 5개 요소를 answer에 추가
        for (int i = 0; i < Math.min(5, num_list.length); i++) {
            answer.add(num_list[i]);
        }
        
        return answer;
    }
}
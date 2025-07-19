import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list) {

        // num_list를 오름차순으로 정렬
        Arrays.sort(num_list);
        // 가장 작은 5개의 수를 제외한 나머지 수들을 담을 리스트
        List<Integer> result = new ArrayList<>();

        // 가장 작은 5개의 수를 제외하고 결과 리스트에 추가
        for (int i = 5; i < num_list.length; i++) {
            result.add(num_list[i]);
        }

        return result;
    }
}
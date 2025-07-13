import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                answer.add(num);
            }
        }

        return answer;
    }


}
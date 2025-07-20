import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for (int i : arr) {
            // 조건1: stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
            if (stk.isEmpty()) {
                stk.add(i);
            } else if (stk.get(stk.size() - 1) == i) {// 조건2: stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
                stk.remove(stk.size() - 1);
            } else if (stk.get(stk.size() - 1) != i) {// 조건3: stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
                stk.add(i);

            }
        }
        
        if (stk.isEmpty()) { // 조건4: 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.
            stk.add(-1);
        }

        return stk;
    }
}
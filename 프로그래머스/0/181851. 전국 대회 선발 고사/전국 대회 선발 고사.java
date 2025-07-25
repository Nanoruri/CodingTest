import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 출석한 학생 인덱스를 rank 기준으로 정렬
        List<Integer> selected = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                selected.add(i);
            }
        }

        // rank 기준 오름차순 정렬
        selected.sort(Comparator.comparingInt(i -> rank[i]));

        // 상위 3명의 인덱스를 이용해 결과 계산
        int a = selected.get(0);
        int b = selected.get(1);
        int c = selected.get(2);

        return 10000 * a + 100 * b + c;
    }
}
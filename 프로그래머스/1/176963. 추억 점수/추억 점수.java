import java.util.HashMap;
import java.util.Map;

class Solution {
public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        // 1. 이름과 그리움 점수를 매핑
        Map<String, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        // 2. 각 사진별 점수 계산
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (String person : photo[i]) {
                score += scoreMap.getOrDefault(person, 0);
            }
            answer[i] = score;
        }

        return answer;
    }
}
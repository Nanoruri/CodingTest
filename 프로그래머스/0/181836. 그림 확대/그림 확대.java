import java.util.List;

class Solution {
    public List<String> solution(String[] picture, int k) {

        List<String> answer = new java.util.ArrayList<>();


        for (String s : picture) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                char pixel = s.charAt(j);
                sb.append(String.valueOf(pixel).repeat(Math.max(0, k))); // k배 늘리기
            }
            // k배 늘린 문자열을 answerList에 추가
            String enlargedRow = sb.toString();
            for (int k2 = 0; k2 < k; k2++) {
                answer.add(enlargedRow); // 각 행을 k번 반복
            }
        }

        return answer;
    }
}
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        // terms내 약관의 타입과 유효기간을 분리하여 Map에 저장.
        Map<String, Integer> separatingTerms = separateTerms(terms);

        // privacies내 약관의 타입과 날짜를 분리하여 Map에 저장.

        //오늘 날짜
        int todayDate = changeStringToDays(today);

        // 약관의 유효기간을 계산하여 만료된 약관을 찾아서 answerArray에 추가.
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String dateStr = parts[0];
            String type = parts[1];

            int privacyDate = changeStringToDays(dateStr);
            int termDuration = separatingTerms.get(type);

            // 유효기간 계산
            int expirationDate = privacyDate + termDuration * 28; // 28일 단위로 계산

            // 만료된 약관인지 확인
            if (todayDate >= expirationDate) {
                // 만료된 약관의 인덱스는 1부터 시작하므로 i + 1을 추가
                answer.add(i + 1);
            }
        }

        return answer;
    }

    private Map<String, Integer> separateTerms(String[] terms) {

        Map<String, Integer> termsMap = new LinkedHashMap<>();

        for (String term : terms) {
            String[] parts = term.split(" ");
            String type = parts[0];
            int duration = Integer.parseInt(parts[1]);
            termsMap.put(type, duration);
        }
        return termsMap;
    }

    private int changeStringToDays(String date) {
        String[] parts = date.split("\\.");


        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);


        return year * 12 * 28 + month * 28 + day;// 년/월/일을 28일 단위로 변환하여 총 일수로 계산
    }

}
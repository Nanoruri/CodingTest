import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        // 문자열 길이별로 그룹화
        List<List<String>> groups = new ArrayList<>();
        for (String str : strArr) {
            int length = str.length();

            // 현재 길이에 해당하는 그룹이 없다면 새로 생성
            while (groups.size() <= length) {
                groups.add(new ArrayList<>());
            }

            // 해당 길이의 그룹에 문자열 추가
            groups.get(length).add(str);
        }


        // 가장 큰 그룹의 크기 찾기
        for (List<String> group : groups) {
            if (group.size() > answer) {
                answer = group.size();
            }
        }

        return answer;
    }
}
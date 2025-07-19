class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();

        for (String s : str_list) {
            // 현재 문자열이 제외할 문자열을 포함하지 않는 경우
            if (!s.contains(ex)) {
                // answer에 현재 문자열을 추가
                answer.append(s);
            }
        }
        
        return answer.toString();
    }
}
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        
// 문자열을 공백을 기준으로 분리하여 배열로 변환
        if (my_string != null && !my_string.isEmpty()) {
            answer = my_string.split(" ");
        }
        
        // 공백으로 분리된 문자열 배열을 반환
        
        return answer;
    }
}
class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'a') {
                answer.append('A'); // 'a'를 'A'로 변환
            } else {
                answer.append(c); // 나머지 문자는 그대로 추가
            }
        }

        return answer.toString();
    }
}
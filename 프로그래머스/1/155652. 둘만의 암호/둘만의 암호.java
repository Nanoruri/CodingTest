class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            for (int j = 0; j < index; j++) {
                cur = nextChar(cur, skip); // 다음 유효 문자를 가져옴
            }

            answer.append(cur);
        }

        return answer.toString();
    }

    // 다음 문자로 이동하되 z 넘으면 a로, skip은 건너뜀
    private char nextChar(char c, String skip) {
        do {
            c++;
            if (c > 'z') {
                c = 'a';
            }
        } while (skip.indexOf(c) != -1);

        return c;
    }
}
class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if (currentChar < 'l') {
                answer.append('l');
            } else {
                answer.append(currentChar);
            }
        }

        return answer.toString();
    }
}
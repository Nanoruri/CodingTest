class Solution {
    public int solution(int a, int b) {
        int answer;

        // a와 b가 모두 홀수라면 a^2 + b^2 점
        if (a % 2 == 1 && b % 2 == 1) {
            answer = a * a + b * b;
        }
        //a와 b 중 하나만 홀수라면 2 × (a + b) 점
        else if (a % 2 == 1 || b % 2 == 1) {
            answer = 2 * (a + b);
        } 
        // a와 b 모두 1이면 10점
        else if (a == 1 && b == 1) {
            answer = 10;
        } 
        // a와 b 모두 홀수가 아니라면 |a - b| 점
        else {
            answer = Math.abs(a - b);
        }

        return answer;
    }
}
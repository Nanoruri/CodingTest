class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};

        if (k % 2 == 1) {// 홀수일 경우
            answer = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        } else { // 짝수일 경우
            answer = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }
        
        return answer;
    }
}
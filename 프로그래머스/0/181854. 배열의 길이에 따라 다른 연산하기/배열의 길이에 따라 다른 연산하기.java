class Solution {
    public int[] solution(int[] arr, int n) {
    int[] answer = new int[arr.length];
    int startIndex = (arr.length % 2 == 1) ? 0 : 1; // 홀수 길이 → 짝수 인덱스, 짝수 길이 → 홀수 인덱스

    for (int i = 0; i < arr.length; i++) {
        answer[i] = (i % 2 == startIndex) ? arr[i] + n : arr[i];
    }

    return answer;
    }
}
class Solution {
     public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    arr[j] += 1;
                }
            }
            answer = arr; // 마지막에 업데이트된 arr를 answer로 설정
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0; // 하나라도 다르면 비대칭
                }
            }
        }

        return 1; // 모든 arr[i][j] == arr[j][i]이면 대칭
    }
}
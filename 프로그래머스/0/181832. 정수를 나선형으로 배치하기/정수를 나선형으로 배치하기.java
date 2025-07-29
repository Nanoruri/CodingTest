import java.util.List;

class Solution {
   public int[][] solution(int n) {
        int [][] answer = new int[n][n];

        //좌표 (x, y)에서 시작하여 시계방향으로 나선형 배열을 채우기 위한 방향 벡터
        int[] dx = {0, 1, 0, -1}; // 오른쪽, 아래, 왼쪽, 위
        int[] dy = {1, 0, -1, 0}; // 오른쪽, 아래, 왼쪽, 위

        // 현재 위치와 방향 초기화
        int x = 0;
        int y = 0;
        int direction = 0;
        int num = 1; // 채울 숫자

        while (num <= n * n) {
            // 현재 위치에 숫자를 채움
            answer[x][y] = num++;

            // 다음 위치 계산
            int nextX = x + dx[direction];
            int nextY = y + dy[direction];
            // 다음 위치가 배열 범위를 벗어나거나 이미 채워진 경우 방향을 바꿈
            if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= n || answer[nextX][nextY] != 0) {
                direction = (direction + 1) % 4; // 방향을 시계방향으로 변경
                nextX = x + dx[direction];
                nextY = y + dy[direction];
            }
            // 다음 위치로 이동
            x = nextX;
            y = nextY;
        }




        return answer;
    }
}
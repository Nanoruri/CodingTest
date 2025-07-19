class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};


        int row = arr.length; // 행의 수
        int col = arr[0].length; // 열의 수
        
        // 행의 수가 열의 수보다 많을 때
        if (row > col) {
            answer = new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    if (j < col) {
                        answer[i][j] = arr[i][j];
                    } else {
                        answer[i][j] = 0; // 0으로 채움
                    }
                }
            }
        }
        
        // 열의 수가 행의 수보다 많을 때
        else if (col > row) {
            answer = new int[col][col];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < col; j++) {
                    if (i < row) {
                        if (j < arr[i].length) {
                            answer[i][j] = arr[i][j];
                        } else {
                            answer[i][j] = 0; // 0으로 채움
                        }
                    } else {
                        answer[i][j] = 0; // 0으로 채움
                    }
                }
            }
        } else {
            // 행과 열의 수가 같을 때
            answer = arr;
        }
        

        return answer;
    }
}
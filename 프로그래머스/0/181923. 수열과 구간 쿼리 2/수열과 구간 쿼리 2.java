import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int[][] queries) {
        List<Integer> answer = new java.util.ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int minValue = Integer.MAX_VALUE;
            boolean found = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < minValue) {
                    minValue = arr[i];
                    found = true;
                }
            }

            if (found) {
                answer.add(minValue);
            } else {
                answer.add(-1);
            }
        }


        return answer;
    }

}
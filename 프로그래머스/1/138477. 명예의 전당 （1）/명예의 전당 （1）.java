import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int k, int[] score) {
        // 최하위점수만 저장하는 리스트
        List<Integer> answer = new ArrayList<>(score.length);
        // 명예의 전당에 올라갈 수 있는 인원 수
        List<Integer> honorHall = new ArrayList<>(k);

        for (int i : score) {
            honorHall.add(i);
            honorHall.sort(Integer::compareTo); // 오름차순 정렬
            if (honorHall.size() > k) {
                // 명예의 전당에 올라갈 수 있는 인원보다 많으면
                // 최하위 점수를 제거
                honorHall.remove(0);
            }
            answer.add(honorHall.get(0)); // 최하위 점수를 추가

        }


        return answer;
    }

}
import java.util.*;

class Solution {
    public List<String> solution(String[] players, String[] callings) {


        // 선수들의 현재 순위를 저장하는 맵을 생성
        Map<String, Integer> playerRankMap = new HashMap<>();

        // 선수들의 이름과 순위를 초기화
        for (int i = 0; i < players.length; i++) {
            playerRankMap.put(players[i], i);
        }

        // 해설진이 부른 선수의 이름을 순회
        for (String calledPlayer : callings) {
            // 부른 선수의 현재 순위를 가져옴
            int currentRank = playerRankMap.get(calledPlayer);

            // 현재 순위가 0보다 크면, 즉 1등이 아니면
            if (currentRank > 0) {
                // 바로 앞 선수의 이름을 찾음
                String frontPlayer = players[currentRank - 1];

                // 순위를 교환
                players[currentRank] = frontPlayer;
                players[currentRank - 1] = calledPlayer;

                // 맵에서 순위 업데이트
                playerRankMap.put(calledPlayer, currentRank - 1);
                playerRankMap.put(frontPlayer, currentRank);
            }
        }
        // 최종 순위를 answer 배열에 저장


        return new ArrayList<>(Arrays.asList(players));
    }
}
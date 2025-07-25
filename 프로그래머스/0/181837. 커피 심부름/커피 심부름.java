class Solution {
    public int solution(String[] order) {
        int answer = 0;


        for (String menu : order) {
            if (menu.contains("americano") || menu.contains("anything")) {
                answer += 4500;
            } else if (menu.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 0; // 정의되지 않은 메뉴는 0원으로 처리
            }
        }

        return answer;
    }
}
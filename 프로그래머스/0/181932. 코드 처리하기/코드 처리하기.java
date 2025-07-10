public class Solution {


    public String solution(String code) {
        StringBuilder answer = new StringBuilder();

        boolean mode = false;// = 0, true = 1


        for (int idx = 0; idx < code.length(); idx++) {
            char st = code.charAt(idx);

            if (st == '1') {
                mode = !mode;// 이러면 반대??
                continue;
            }

            if (!mode && idx % 2 == 0) {// 0일때를 구현
                answer.append(st);
            } else if (mode && idx % 2 == 1) {// 1일때를 구현
                answer.append(st);
            }

        }

        return answer.length() == 0 ? "EMPTY" : String.valueOf(answer);
    }


}

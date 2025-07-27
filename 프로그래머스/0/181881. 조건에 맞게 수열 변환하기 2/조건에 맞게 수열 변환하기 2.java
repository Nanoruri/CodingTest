import java.util.ArrayList;
import java.util.List;

class Solution {
  public int solution(int[] arr) {
        int answer = 0;

        List<Integer> convertArrList = new ArrayList<>();
        for (int j : arr) {
            convertArrList.add(j); // 편의성을 위해 배열을 리스트로 변환
        }


        while (true) {// convertArrlist가 변환되지 않을 때까지 반복
            List<Integer> nextConvertArrlist = new ArrayList<>();

            for (Integer integer : convertArrList) {
                nextConvertArrlist.add(convert(integer)); // 변환된 리스트를 다음 변환 리스트에 추가

            }

            if (convertArrList.equals(nextConvertArrlist)) {// 변환된 리스트가 이전 리스트와 같아질때까지 반복
                break;
            }
            convertArrList = nextConvertArrlist;// 변환된 리스트를 다음 반복을 위해 저장
            answer++;// 변환 횟수 증가
        }

        return answer;
    }

    public int convert(int num) {
        if (num >= 50 && num % 2 == 0) {
            return num / 2;
        } else if (num < 50 && num % 2 == 1) {
            return num * 2 + 1;
        }
        return num; // 조건에 맞지 않는 경우 원래 숫자를 반환
    }
}
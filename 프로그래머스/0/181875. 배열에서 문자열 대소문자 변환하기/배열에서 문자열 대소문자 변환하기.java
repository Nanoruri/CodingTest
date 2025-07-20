class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            
            if (i %2 == 0){
                // 짝수 길이인 경우
                strArr[i] = strArr[i].toLowerCase();
            } else {
                // 홀수 길이인 경우
                strArr[i] = strArr[i].toUpperCase();
            }
        }

        return strArr;
    }
}
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();

        for (int i = 0; i <= t.length() - pLength; i++) {
            String tSubstring = t.substring(i, i + pLength);
            long substringValue = Long.parseLong(tSubstring);
            long pValue = Long.parseLong(p);

            if (substringValue <= pValue) {
                answer++;
            }
        }

        return answer;
    }
}
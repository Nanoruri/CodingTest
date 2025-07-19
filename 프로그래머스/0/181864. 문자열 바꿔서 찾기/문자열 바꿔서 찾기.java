class Solution {
    public int solution(String myString, String pat) {

        char[] chars = myString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
                chars[i] = 'B';
            } else if (chars[i] == 'B') {
                chars[i] = 'A';
            }
        }

        return new String(chars).contains(pat) ? 1 : 0;
    }
}
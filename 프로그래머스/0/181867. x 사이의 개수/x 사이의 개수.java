class Solution {
   public int[] solution(String myString) {
        String[] parts = myString.split("x", -1); // 빈 문자열 포함하여 split
        int[] result = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            result[i] = parts[i].length();
        }

        return result;
    }
}
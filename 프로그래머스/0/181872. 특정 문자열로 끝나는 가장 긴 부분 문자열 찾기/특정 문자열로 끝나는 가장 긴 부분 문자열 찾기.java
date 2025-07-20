class Solution {
    public String solution(String myString, String pat) {
        int end =  myString.lastIndexOf(pat);

        return myString.substring(0, end + pat.length());
    }
}
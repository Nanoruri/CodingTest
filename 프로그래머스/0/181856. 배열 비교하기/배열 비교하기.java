class Solution {
    public int solution(int[] arr1, int[] arr2) {
        //조건 1 
        int answer = Integer.compare(arr1.length, arr2.length);
        
        //조건 2
        if (arr1.length == arr2.length) {
            answer = Integer.compare(sumArray(arr1), sumArray(arr2));
        }

        return answer;
    }


    private int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
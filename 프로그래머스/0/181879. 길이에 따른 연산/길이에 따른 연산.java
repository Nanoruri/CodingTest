class Solution {
    public int solution(int[] num_list) {
        if (num_list.length >= 11) {
            return numList_sum(num_list);
        } else {
            return numList_product(num_list);
        }
        
    }

    private int numList_product(int[] numList) {
        int product = 1;
        
        for (int num : numList) {
            product *= num;
        }
        return product;
    }

    private int numList_sum(int[] numList) {
        int sum = 0;
        
        for (int num : numList) {
            sum += num;
        }
        return sum;
    }
}
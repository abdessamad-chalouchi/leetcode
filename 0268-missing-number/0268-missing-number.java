class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int actuallySum = 0;
        for (int i = 0; i<nums.length; i++){
            sum += nums[i];
            actuallySum += i;
        }
        actuallySum += nums.length;
        return actuallySum - sum;
    }
}
class Solution {
    public long maximumTripletValue(int[] nums) {
        // option 1
        long maxValue = 0L;
        int prefixMax = nums[0];
        long maxDiff=0L;
        for (int k=1;k<nums.length; k++){
            maxValue = Math.max(maxValue, (long)(maxDiff*nums[k]));
            maxDiff = Math.max(maxDiff, (long)(prefixMax - nums[k]));
            prefixMax = Math.max(prefixMax, nums[k]);
        }
        return maxValue;
    }
}
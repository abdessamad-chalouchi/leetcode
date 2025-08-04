class Solution {
    public int waysToSplitArray(int[] nums) {
        int sum = 0;
        int count = 0;
        int sumLeft=0, sumRight=0;
        for(int i = 0; i<nums.length; i++){
            sum+= nums[i];
        }
        // System.out.println(sum);
        for (int i=0;i<nums.length-1; i++){
            sumLeft += nums[i];
            sumRight = sum - sumLeft;
            if(sumLeft >= sumRight){
                count++;
            }
        }
        return count;
    }
}
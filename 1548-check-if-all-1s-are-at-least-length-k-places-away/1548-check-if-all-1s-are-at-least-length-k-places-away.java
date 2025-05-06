class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int space = 0;
        int left = 0;
        while(left<nums.length){
            if(nums[left] == 1){
                int right = left + 1;
                while(right < nums.length && nums[right]==0){
                    right++;
                }
                if(right < nums.length && right - left - 1 < k){
                    return false;
                }
                left = right;
            }else{
                left++;
            }   
        }
        return true;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int med = 0, start = 0, end = nums.length;
        while (start < end){
            med = start + (end - start)/2;
            if(nums[med] == target) return med;
            if(nums[med] < target){
                start = med +1;
            }else if(nums[med] > target){
                end = med;
            }
        }
        if(start >= end && nums[med] != target) return -1;
        return med;
    }
}
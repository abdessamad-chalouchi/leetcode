class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0, end = nums.length, med;
        while (start < end){
            med = start + (end-start)/2;
            if(nums[med] == target) return med;
            if(nums[med] < target) start = med +1;
            else end = med;
        }
        // if()
        // System.out.println(start);
        // System.out.println(end);
        return end;
    }
}
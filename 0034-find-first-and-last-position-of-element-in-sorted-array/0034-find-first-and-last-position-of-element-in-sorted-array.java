class Solution {
    private int findPosition(int[] nums, int target, boolean findFirst){
        int start = 0, end = nums.length - 1, position = -1;
        while(start <= end){
            int med = start + (end - start)/2;
            if(nums[med] == target){
                position = med;
                if(findFirst) end = med-1;
                else start = med+1;
            }else if(nums[med] < target)
                start = med +1;
            else
                end = med-1;
        }
        return position;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findPosition(nums, target, true);
        result[1] = findPosition(nums, target, false);
        return result;
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        long first=Long.MIN_VALUE, second=Long.MIN_VALUE, third=Long.MIN_VALUE, tmp;
        if(nums.length < 3) return Math.max(nums[0], nums[nums.length-1]);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != first && nums[i] != second && nums[i] != third){
                if(nums[i]>first){
                    tmp = second;
                    second = first;
                    third = tmp;
                    first = nums[i];
                }
                else if (nums[i] > second){
                    third = second;
                    second = nums[i];
                }
                else if (nums[i] > third)
                    third = nums[i];
            }
            
        }
        if (third == Long.MIN_VALUE) return (int)first;
        return (int)third;
    }
}
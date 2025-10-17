class Solution {

//     4 ^ 1 ^ 2 ^ 1 ^ 2
// = (1 ^ 1) ^ (2 ^ 2) ^ 4
// = 0 ^ 0 ^ 4
// = 4
    public int singleNumber(int[] nums) {
        int r = 0;
        for (int n : nums){
            r ^= n;
        }
        return r;
    }
}
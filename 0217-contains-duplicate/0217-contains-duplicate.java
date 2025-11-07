class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int a: nums)
            set.add(a);
        return set.size() != nums.length;
    }
}
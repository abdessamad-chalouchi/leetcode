class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int num : nums) {
            map.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!map.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}
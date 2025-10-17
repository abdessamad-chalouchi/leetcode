class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums){
            if(s.contains(n)){
                s.remove(n);
            }else{
                s.add(n);
            }
        }
        return s.iterator().next();
    }
}
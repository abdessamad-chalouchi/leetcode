class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int a: nums){
            set.add(a);
        }
        List<Integer> list = set.stream().toList();
        for(int i=0; i<set.size(); i++){
            if(i != list.get(i)){
                return i;
            }
        }
        return nums.length;
    }
}
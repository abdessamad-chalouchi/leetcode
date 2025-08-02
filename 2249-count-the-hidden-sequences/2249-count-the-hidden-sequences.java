class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long minRange=0L, maxRange=0L;
        long tmp = 0L;
        for(int i=0; i<differences.length; i++){
            tmp += differences[i];
            minRange = Math.min(tmp, minRange);
            maxRange = Math.max(tmp, maxRange);
        }
        maxRange = upper - maxRange;
        minRange = lower - minRange;
        int result = Math.max((int)(maxRange - minRange)+1, 0);
        return result;
    }
}
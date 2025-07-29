class Solution {
    public int mySqrt(int x) {
        int r = 0;
        int low = 0,high = x; 
        while(low <= high){
            long mid=(low+high)/2;
            if (mid * mid == x)
                return (int) mid;
            else if(mid * mid <x){
                r = (int) mid;
                low = (int) mid +1;
            }
            else 
                high = (int) mid-1; 
        }
        return r;
    }
}
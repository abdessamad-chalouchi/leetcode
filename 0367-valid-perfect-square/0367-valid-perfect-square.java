class Solution {
    public boolean isPerfectSquare(int num) {
        double tmp = Math.sqrt(num);
        int tmp1 = (int)Math.sqrt(num);
        // System.out.println(tmp);
        // System.out.println(tmp1);
        return tmp == tmp1;
    }
}
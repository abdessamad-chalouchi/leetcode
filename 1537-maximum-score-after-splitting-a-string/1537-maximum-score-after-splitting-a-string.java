class Solution {
    public int maxScore(String s) {
        int sum = 0;
        int leftZone = 0;
        int rightZone = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                rightZone++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZone++;
            } else {
                rightZone--;
            }
            sum = Math.max(sum, leftZone + rightZone);
        }
        return sum;
    }
}
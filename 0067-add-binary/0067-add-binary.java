class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int tmp = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            int r = 0;
            if (i < 0) {
                r = (b.charAt(j) - '0') + tmp;
            } else if (j < 0) {
                r = (a.charAt(i) - '0') + tmp;
            } else {
                r = (a.charAt(i) - '0') + (b.charAt(j) - '0') + tmp;
            }
            if (r == 2) {
                tmp = 1;
                result.insert(0, "0");
            } else if (r == 3) {
                tmp = 1;
                result.insert(0, "1");
            } else {
                tmp = 0;
                result.insert(0, r);
            }
            j--;
            i--;
        }
        if (tmp != 0) {
            result.insert(0, tmp);
        }
        return result.toString();
    }
}
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        if (a.length() > b.length()) {
            b = "0".repeat(a.length() - b.length()) + b;
        } else {
            a = "0".repeat(b.length() - a.length()) + a;
        }
        int tmp = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int r = (a.charAt(i) - '0') + (b.charAt(i) - '0') + tmp;
            if (r == 2) {
                tmp = 1;
                result.append("0");
            } else if (r == 3) {
                tmp = 1;
                result.append("1");
            } else {
                tmp = 0;
                result.append(r);
            }
        }
        if (tmp != 0) {
            result.append(tmp);
        }
        return result.reverse().toString();
    }
}
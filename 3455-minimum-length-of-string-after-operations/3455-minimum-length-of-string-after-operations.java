class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        if (n <= 2) {
            return n;
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            if (charCount.get(c) > 2) {
                n = n - 2;
                charCount.put(c, charCount.get(c) - 2);
            }
        }
        return n;
    }
}
class Solution {
    public int gcd(int a , int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            m.put(deck[i], m.getOrDefault(deck[i], 0) + 1);
        }
        // if (deck.length < 1 || m.get(deck[0]) <= 1) {
        //     return false;
        // }
        int gcd = 0;
        for (int v : m.values()) {
            gcd = gcd(gcd, v);
        }
        return gcd > 1;
    }
}
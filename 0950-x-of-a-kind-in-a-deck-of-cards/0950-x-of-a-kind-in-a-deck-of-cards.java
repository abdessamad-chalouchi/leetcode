class Solution {
    public int gcd(int a , int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    public boolean hasGroupsSizeX(int[] deck) {
        
        // HashMap<Integer, Integer> m = new HashMap<>();
        // for (int i = 0; i < deck.length; i++) {
        //     m.put(deck[i], m.getOrDefault(deck[i], 0) + 1);
        // }
        int[] freq = new int[10000];
        for(int card : deck){
            freq[card]++;
        }
        int gcd = 0;
        for (int v : freq) {
            if(v > 0){
                gcd = gcd(gcd, v);
            }
            // if (gcd == 1) return false;
        }
        return gcd > 1;
    }
}
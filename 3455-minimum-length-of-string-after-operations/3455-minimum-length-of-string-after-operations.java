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
    // public int minimumLength(String s) {
    //     int arr[]= new int[26];


    //     for(int i=0;i<s.length();i++){
    //         char ch= s.charAt(i);

    //         arr[ch-97]++;
    //     }

    //     int count=0;
    //     for(int i=0;i<26;i++){
    //         if(arr[i]!=0){
    //         count+=(arr[i]%2==0) ? 2 :1;
    //         }
    //     }
    //     return count;
    // }
}
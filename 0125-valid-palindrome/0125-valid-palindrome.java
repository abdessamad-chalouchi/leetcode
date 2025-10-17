class Solution {
    public boolean isPalindrome(String ss) {
        // s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s = "";
        for(char c : ss.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)) s+= c;
        }
        s = s.toLowerCase();
        int left=0, right=s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
        // return s.equals(new StringBuilder(s).reverse().toString());
    }
}
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int targetI = target, start = 0, end = letters.length-1;
        int  med;
        while(start < end){
            med = start + (end - start) / 2;
            if(letters[med]> target) end = med;
            if(letters[med] <= target) start=med+1;
        }
        return letters[start % letters.length] > target ? letters[start % letters.length] : letters[0];
    }
}
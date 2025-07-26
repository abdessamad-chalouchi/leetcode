import java.util.regex.Pattern;
class Solution {
    public boolean isVowel(char c){
        return "aeiou".indexOf(c) != -1;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];
        int[] r = new int[words.length];
        Pattern p = Pattern.compile("^[aeiou].*[aeiou]$");
        Pattern p1 = Pattern.compile("^[aeiou]");
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1)))
                sum++;
            r[i] = sum;
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0)
                res[i] = r[queries[i][1]];
            else
                res[i] = r[queries[i][1]] - r[queries[i][0] - 1];
        }
        return res;
    }
}
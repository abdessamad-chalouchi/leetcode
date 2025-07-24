class Solution {
    // public int calculatSum(String s){
    //     int sum = 0;
    //     for (int i = 1;i<=s.length();i++){
    //         sum += Integer.valueOf(s.substring(i-1,i));
    //     }
    //     return sum;
    // }
    // public String sumOfString(String s, int k){
    //     StringBuilder sb = new StringBuilder();
    //     while(s.length() != 0){
    //         String a = s.substring(0,Math.min(k,s.length()));
    //         sb.append(calculatSum(a));
    //         s = s.substring(Math.min(k,s.length()));
    //     }
    //     return sb.toString();
    // }
    public String digitSum(String s, int k) {
        // while(s.length()>k){   
        //     s = sumOfString(s,k);
        // }
        // return s;
        while(s.length()>k){   
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int i = 0; i< s.length();i++){
                sum += s.charAt(i)-'0';
                if ((i+1) % k == 0 || i == s.length() -1){
                    sb.append(sum);
                    sum=0;
                }
            }
            s = sb.toString();
        }
        return s;
    }
}
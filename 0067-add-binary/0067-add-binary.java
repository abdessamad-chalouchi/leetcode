class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0; // To track the carry
        int i = a.length() - 1, j = b.length() - 1;

        // Process both strings from the end
        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0; // Get digit from 'a' or 0 if out of bounds
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0; // Get digit from 'b' or 0 if out of bounds

            int sum = digitA + digitB + carry; // Add digits and carry
            carry = sum / 2; // Update carry (1 if sum >= 2, else 0)
            result.append(sum % 2); // Append the remainder (0 or 1) to result

            i--; // Move to the next digit in 'a'
            j--; // Move to the next digit in 'b'
        }
        return result.reverse().toString();
    }
}
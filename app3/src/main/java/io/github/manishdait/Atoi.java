package io.github.manishdait;

/*
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

    Whitespace: Ignore any leading whitespace (" ").
    Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
    Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
    Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.

Return the integer as the final result.


 */
class Solution {
    public int myAtoi(String s) {
        boolean neg = false;
        s = s.trim();

        double n = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == 0 && (ch == '-' || ch == '+')) {
                neg = ch == '-'? true : false;
                continue;
            }

            if (ch >= '0' && ch <= '9') {
                n = n*10 + (int)(ch - '0');
            } else {
                break;
            }
        }

        if (neg) {
            n = n * -1;
        }

        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            n = n > Integer.MAX_VALUE? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return (int) n;
    }
}
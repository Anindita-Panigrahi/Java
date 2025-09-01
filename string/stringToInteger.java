public class stringToInteger {
        static class Solution {
            public int myAtoi(String s) {
                int i = 0, n = s.length();
                int sign = 1;
                long result = 0;
    
                while (i < n && s.charAt(i) == ' ') i++;
    
                if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                    sign = (s.charAt(i) == '-') ? -1 : 1;
                    i++;
                }
    
                while (i < n && Character.isDigit(s.charAt(i))) {
                    result = result * 10 + (s.charAt(i) - '0');
    
                    if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                    if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
    
                    i++;
                }
    
                return (int) (result * sign);
            }
        }
    
        public static void main(String[] args) {
            Solution sol = new Solution();
    
            // Test cases as per leetcode
            System.out.println(sol.myAtoi("42"));          // Output: 42
            System.out.println(sol.myAtoi("   -042"));     // Output: -42
            System.out.println(sol.myAtoi("1337c0d3"));    // Output: 1337
            System.out.println(sol.myAtoi("0-1"));         // Output: 0
            System.out.println(sol.myAtoi("words and 987")); // Output: 0
        }
    }

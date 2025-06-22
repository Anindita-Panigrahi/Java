class removeOuterParen {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (openCount > 0) {
                    result.append(ch);
                }
                openCount++;
            } else {
                openCount--;
                if (openCount > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
       
        String input = "(()())(())(()(()))";
        String output = removeOuterParentheses(input);

        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }
}

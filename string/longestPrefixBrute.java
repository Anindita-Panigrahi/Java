public class longestPrefixBrute {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + prefix);
    }
}

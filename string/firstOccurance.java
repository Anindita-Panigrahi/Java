public class firstOccurance {

    public static void findAllOccurrences(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) {
            System.out.println("Empty needle. Every index is a match.");
            return;
        }

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                System.out.println("Found at index: " + i);
            }
        }
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        findAllOccurrences(haystack, needle);
    }
}

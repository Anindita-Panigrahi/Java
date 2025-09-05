public class beautySum{
    public static int findBeautySum(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26]; // frequency map

            for (int j = i; j < s.length(); j++) {
                int charIndex = s.charAt(j) - 'a';
                freq[charIndex]++;
                int maxFreq = 0;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                    }
                }
                int minFreq = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                int beauty = maxFreq - minFreq;
                result += beauty;
               
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "aabcb";
        System.out.println("Final Beauty Sum = " + findBeautySum(str));
    }
}

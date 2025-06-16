public class reverse {
    public static int reverseBits(int n) {
        int reversed = 0;

        for (int i = 0; i < 32; i++) {
            reversed = (reversed << 1) | (n & 1);
            n >>= 1;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int input = 43261596; // Example input
        int output = reverseBits(input);
        System.out.println("Reversed string is" + output);
    }
    
}

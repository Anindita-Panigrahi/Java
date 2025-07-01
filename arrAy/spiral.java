import java.util.*;

public class spiral {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int sr = 0, er = matrix.length - 1;
        int sc = 0, ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {
            // Top row
            for (int j = sc; j <= ec; j++) {
                result.add(matrix[sr][j]);
            }

            // Right column
            for (int i = sr + 1; i <= er; i++) {
                result.add(matrix[i][ec]);
            }

            // Bottom row (check to avoid double print)
            if (sr < er) {
                for (int j = ec - 1; j >= sc; j--) {
                    result.add(matrix[er][j]);
                }
            }

            // Left column (check to avoid double print)
            if (sc < ec) {
                for (int i = er - 1; i > sr; i--) {
                    result.add(matrix[i][sc]);
                }
            }

            sr++;
            er--;
            sc++;
            ec--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  2,  3, 4},
            { 5,  6,  7, 8},
            { 9, 10, 11,12}
        };

        List<Integer> output = spiralOrder(matrix);
        System.out.println("Spiral order: " + output);
    }
}

import java.util.Scanner;

public class SetMatZero {
    public static void renew(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];

        // Mark rows and columns that contain zeros
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Set elements to zero based on marked rows and columns
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rows[i] || cols[j]) {
                    arr[i][j] = 0;
                }
            }
        }

        // Print the modified matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        renew(mat);
    }
}
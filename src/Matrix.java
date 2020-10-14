import java.util.Scanner;

public class Matrix {
    private Scanner input = new Scanner(System.in);
    private int row, column;
    private int[][] matrix;

    public Matrix (int row, int column) {
        this.row = row;
        this.column = column;
        matrix = new int[row][column];

        setMatrix (matrix);
    }

    private void setMatrix (int[][] mat) {
        int ad, bc, d;

        int temp[][] = new int[row][column];

        for (int i = 0; i < temp.length; i++) {
            for (int k = 0; k < temp.length; k++) {
                System.out.printf("Enter entry %d of R%d (R%d):\n", i, (i+1), i+1);
                temp[i][k] = input.nextInt();
            }
        }

        ad = temp[0][0] * temp[1][1];
        bc = temp[0][1] * temp[1][0];
        d = ad - bc;
        System.out.printf("Determinant: %d", d);
    }
}

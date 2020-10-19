
import java.util.Scanner;

public class Matrix {
    private Scanner input = new Scanner(System.in);
    private int row, column, determinant;
    private int[][] matrix2d, matrix_3d, matrix_4d;

    public Matrix (int row, int column) {
        if ( (row == 1) && (column == 1) ) {
            System.out.print("The determinant is: 1");
        }

        else if ( (row == 2) && (column == 2) ) {
            this.row = row;
            this.column = column;
            matrix2d = new int[row][column];

            setMatrix2D (matrix2d);
        }

        else if ( (row == 3) && (column == 3) ) {
            this.row = row;
            this.column = column;
            matrix_3d = new int[row][column];

            setMatrix3D (matrix_3d);
        }

        else if ( (row == 4) && (column == 4) ) {
            this.row = row;
            this.column = column;
            matrix_4d = new int[row][column];

            setMatrix4D (matrix_4d);
        }

        else {
            System.out.print("The determinant is: Undefined");
        }
    }

    private void setMatrix2D (int[][] mat) {
        int temp[][];
        int ad, bc;

        temp = getMatrix(mat);

        ad = temp[0][0] * temp[1][1];
        bc = temp[0][1] * temp[1][0];
        determinant = ad - bc;

        System.out.printf("Determinant: %d", determinant);
    }

    private void setMatrix3D (int[][] mat) {
        int temp[][];
        int a, b, c, r1, r2, r3;

        temp = getMatrix(mat);

        a = temp[0][0];
        b = temp[0][1];
        c = temp[0][2];

        r1 = a * ( (temp[1][1] * temp[2][2]) - (temp[1][2] * temp[2][1]) ); // + a * (ei - fh)
        r2 = -b * ( (temp[1][0] * temp[2][2]) - (temp[1][2] * temp[2][0]) ); // - b * (di - fg)
        r3 = c * ( (temp[1][0] * temp[2][1]) - (temp[1][1] * temp[2][0]) ); // + c * (dh - eg)

        determinant = r1 + r2 + r3;

        System.out.printf("The determinant is: %d", determinant);
    }

    private void setMatrix4D (int[][] mat) {
        int temp[][];
        int a, b, c, d, r1, r2, r3, r4;

        temp = getMatrix(mat);

        a = temp[0][0];
        b = temp[0][1];
        c = temp[0][2];
        d = temp[0][3];

        r1 = a * ( (temp[1][1] * temp[2][2]) - (temp[1][2] * temp[2][1]) ); // + a * (ei - fh)
        r2 = -b * ( (temp[1][0] * temp[2][2]) - (temp[1][2] * temp[2][0]) ); // - b * (di - fg)
        r3 = c * ( (temp[1][0] * temp[2][1]) - (temp[1][1] * temp[2][0]) ); // + c * (dh - eg)
        r4 = -d * ( (temp[1][0] * temp[2][1]) - (temp[1][1] * temp[2][0]) ); // + c * (dh - eg)

        determinant = r1 + r2 + r3 - r4;

        System.out.printf("The determinant is: %d", determinant);
    }

    /**
     * This function takes the size of a matrix
     * and sets asks for the values to be inputted.
     *
     * @param matrix
     * @return matrix settled
     */
    private int[][] getMatrix (int[][] matrix) {
        int temp[][] = new int[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                System.out.printf("Enter R%d: \n", i+1);
                temp[i][k] = input.nextInt();
            }
        }
        return temp;
    }
}

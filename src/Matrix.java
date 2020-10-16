import javax.swing.*;
import java.util.Scanner;

public class Matrix {
    private Scanner input = new Scanner(System.in);
    private int row, column, ad, bc, d;
    private int[][] matrix_3d;
    private int[][] matrix;

    public Matrix (int row, int column) {
        if ( (row == 1) && (column == 1) ) {
            System.out.print("The determinant is: 1");
        }

        else if ( (row == 2) && (column == 2) ) {
            this.row = row;
            this.column = column;
            matrix = new int[row][column];

            setMatrix2D (matrix);
        }

        else if ( (row == 3) && (column == 3) ) {
            this.row = row;
            this.column = column;
            matrix_3d = new int[row][column];

            setMatrix3D (matrix);
        }

        else if ( (row == 4) && (column == 4) ) {
            this.row = row;
            this.column = column;
            matrix_3d = new int[row][column];

            setMatrix4D (matrix);
        }

        else {
            System.out.print("The determinant is: Undefined");
        }
    }

    private void setMatrix2D (int[][] mat) {
        int temp[][] = new int[row][column];

        for (int i = 0; i < temp.length; i++) {
            for (int k = 0; k < temp.length; k++) {
                System.out.printf("Enter R%d: \n", i);
                temp[i][k] = input.nextInt();
            }
        }

        ad = temp[0][0] * temp[1][1];
        bc = temp[0][1] * temp[1][0];
        d = ad - bc;
        System.out.printf("Determinant: %d", d);
    }

    private void setMatrix3D (int[][] mat) {
        int temp[][] = new int[row][column];

        for (int i = 0; i < temp.length; i++) {
            for (int k = 0; k < temp.length; k++) {
                System.out.printf("Enter R%d: \n", i);
                temp[i][k] = input.nextInt();
            }
        }

        // Perform cross method
    }

    private void setMatrix4D (int[][] mat) {

    }
}

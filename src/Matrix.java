import javax.swing.*;
import java.util.Scanner;

public class Matrix {
    private Scanner input = new Scanner(System.in);
    private int row, column, ad, bc, d;
    private int[][] matrix;

    public Matrix (int row, int column) {
        if ( (row < 1) && (column < 1) ) {
            JOptionPane.showMessageDialog(null, "Determinant: 1");
        }

        this.row = row;
        this.column = column;
        matrix = new int[row][column];

        setMatrix2D (matrix);
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
}

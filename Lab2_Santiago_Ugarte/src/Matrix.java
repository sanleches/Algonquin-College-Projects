import java.util.Arrays;
/**

 * Class Matrix wich contains all the implementations for all the functions and operatrions of a matrix

 * Student Name: Santiago Ugarte

 * Student Number: 041090461

 * Course: CST8132 Object Oriented Programming

 * Program: CET-CS-Level 2

 * Professor:  James Mwangi PhD.

 *

 */
public class Matrix {
    private double[][] array;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.array = new double[rows][columns];
    }

    public Matrix(double[][] array) {
        this.rows = array.length;
        this.columns = array[0].length;
        this.array = array;
    }

    public Matrix add(Matrix matrix) {

        double[][] resultArray = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultArray[i][j] = array[i][j] + matrix.array[i][j];
            }
        }
        return new Matrix(resultArray);
    }

    public Matrix sub(Matrix matrix) {

        double[][] resultArray = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultArray[i][j] = array[i][j] - matrix.array[i][j];
            }
        }
        return new Matrix(resultArray);
    }

    public Matrix mult(Matrix matrix) {

        double[][] resultArray = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultArray[i][j] = array[i][j] * matrix.array[i][j];
            }
        }
        return new Matrix(resultArray);
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public Matrix subMatrix(int startRow, int startColumn, int length, int width) {
        double[][] resultArray = new double[length][width];
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                resultArray[i][j] = array[startRow + i][startColumn + j];
            }
        }
        return new Matrix(resultArray);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (double[] row : array) {
            result.append(Arrays.toString(row));
            result.append('\n');
        }

        return result.toString();
    }
}

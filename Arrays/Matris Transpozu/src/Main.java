import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};

        System.out.println("Matris");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + "   ");
            System.out.println();
        }

        System.out.println("matrisin transpozu : ");
        //int[][] matrix_transpoze = new int[weight][length];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
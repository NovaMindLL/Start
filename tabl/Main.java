package tabl;

public class Main {
    public static void main(String[] args) {
        int cols = 9, rows = 9;
        int[][] tab = new int[rows][cols];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < cols; j++) {
                tab[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", tab[i][j]);
            }
            System.out.println();
        }

    }
}

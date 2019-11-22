public class Matrix {
    public static void main(String[] args) {
        int[]array0[] = {{1,2,3,4},{5,6,7,8},{8,9,10,11}};
        int[]array1[] = {{4,3,2,1},{7,6,5,6},{20,21,22,23}};
        int[][] result = new int[array0.length][array1[0].length];

        for (int a =0; a < array0.length; a++) {
            for (int b = 0; b < array1[0].length; b++) {
                for (int c = 0; c < array1.length; c++) {
                    result[a][b] += result[a][b] + (array0[a][c] * array1[c][b]);
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.format("%4d ", result[i][j]);
            }
            System.out.println();
          }
        }
    }



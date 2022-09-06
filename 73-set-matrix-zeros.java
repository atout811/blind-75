class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> cor = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    cor.add(new int[] { i, j });
                }
            }
        }
        for (int[] indices : cor) {
            int k = 0;
            while (k < matrix.length) {
                matrix[k][indices[1]] = 0;
                k++;
            }
            k = 0;
            while (k < matrix[0].length) {
                matrix[indices[0]][k] = 0;
                k++;
            }
        }

    }
}
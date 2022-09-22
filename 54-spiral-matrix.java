class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int size = matrix.length * matrix[0].length;
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1;

        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                if (spiral.size() == size)
                    break;
                spiral.add(matrix[left][i]);
            }
            for (int i = up + 1; i <= down; i++) {
                if (spiral.size() == size)
                    break;
                spiral.add(matrix[i][right]);
            }
            for (int i = right - 1; i > left; i--) {
                if (spiral.size() == size)
                    break;

                spiral.add(matrix[down][i]);
            }
            for (int i = down; i > up; i--) {
                if (spiral.size() == size)
                    break;
                spiral.add(matrix[i][left]);
            }

            System.out.println(left + " " + right + " " + up + " " + down);
            left++;
            right--;
            up++;
            down--;

        }
        return spiral;

    }
}
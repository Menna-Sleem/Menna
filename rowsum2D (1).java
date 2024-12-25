public class DiagonalElements {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
       int maxSum = Integer.MIN_VALUE; 
        int rowIndex = -1; 
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j]; 
            }
            if (rowSum > maxSum) { 
                maxSum = rowSum;
                rowIndex = i;
            }
        }

        System.out.println("Row with the maximum sum is: " + (rowIndex + 1));
        System.out.println("Maximum sum is: " + maxSum);
    }
}
       

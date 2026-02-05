package javacoursepackage;

public class Program8 {

	public static void main(String[] args) {
		
		int matrix[][] = {
				{9,8,7,6},
				{5,4,3,2},
				{1,0,8,7}
				};

		 int top = 0;
	     int bottom = matrix.length - 1;
	     int left = 0;
	     int right = matrix[0].length - 1;
	     
	     while (top <= bottom && left <= right) {

	            // Left to Right
	            for (int i = left; i <= right; i++) {
	                System.out.print(matrix[top][i] + " ");
	            }
	            top++;

	            // Top to Bottom
	            for (int i = top; i <= bottom; i++) {
	                System.out.print(matrix[i][right] + " ");
	            }
	            right--;

	            // Right to Left
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    System.out.print(matrix[bottom][i] + " ");
	                }
	                bottom--;
	            }

	            // Bottom to Top
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    System.out.print(matrix[i][left] + " ");
	                }
	                left++;
	            }
	     }
	}

}

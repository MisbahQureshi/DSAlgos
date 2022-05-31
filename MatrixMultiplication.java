import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int row1 = scn.nextInt();
	    int col1 = scn.nextInt();
	    int[][] arr1 = new int[row1][col1];
	    for (int i = 0; i < row1; i++) {                    
	      for (int j = 0; j < col1; j++) {
	        arr1[i][j] = scn.nextInt();
	      }
	    }
	    int row2 = scn.nextInt();
	    int col2 = scn.nextInt();
	    int[][] arr2 = new int[row2][col2];
	    for (int i = 0; i < row2; i++) {                      
	      for (int j = 0; j < col2; j++) {
	        arr2[i][j] = scn.nextInt();
	      }
	    }
	    
	    if(col1 != row2) {
	    	System.out.println("not possible");
	    	return;
	    }
	    
	    int[][] product = new int[row1][col2];
	    for (int i = 0; i < product.length; i++) {                     
		      for (int j = 0; j < product[0].length; j++) {
		        for(int k=0; k< col1; k++) {
		        	product[i][j] += arr1[i][k]*arr2[k][j];
		        }
		      }
		    }
	    
	    for (int i = 0; i < product.length; i++) {                    
		      for (int j = 0; j < product[0].length; j++) {
		       System.out.print(product[i][j] + " ");
		      }
		      System.out.println();
		    }
	  
	}

}

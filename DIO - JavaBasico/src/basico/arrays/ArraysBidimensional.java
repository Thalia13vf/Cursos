package basico.arrays;

public class ArraysBidimensional {
	public static void main(String[] args) {
		int[][] arrays = {{1,2,3,4},{5,6,7}};
		
		for(int i =0; i<arrays.length; i++) 
		{
			for(int j = 0; j<arrays[i].length; j++) 
			{
				System.out.println(arrays[i][j]);
			}
		}
		
	}
}

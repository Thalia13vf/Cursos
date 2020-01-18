package basico.arrays;

public class Arrays {
	public static void main(String[] args) {
		int[] meuArray = new int[4];
		meuArray[0] = 1;
		meuArray[1] = 3;
		meuArray[2] = 5;
		meuArray[3] = 6;
		
		int[] array = {7, 8, 9, 3};
		
		for(int i = 0; i < meuArray.length; i++) 
		{
			System.out.println(meuArray[i]);
		}
		System.out.println("---------------------------");
		
		for(int i = 0; i < array.length; i++ ) 
		{
			System.out.println(array[i]);
		}
	}
}

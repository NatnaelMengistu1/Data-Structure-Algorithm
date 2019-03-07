import java.util.HashMap;

public class Problem4 {
	
	
	
	
	public static void checksum(int testarray1[], int testarray2[],int n, int m , int x)
	{
		// complete the checksum() method to find out
		// if there exists a number from testarray1, and a number from testarray2, both testarray1 and testarray2 are sorted already,
		// such that, their sum is exactly x
		// algorithm O(n) expected
		// algorithm O(nlogn) or slower will be scored out of 10 points
		
		
	// Insert all elements of first array in a hash 
			HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i ++) 
				s.put(testarray1[i], 0);
			// Subtract sum from second array elements one 
			// by one and check it's present in array first 
			// or not 
			for (int j = 0; j < m; j ++) 
				if (s.containsKey(x - testarray2[j])) 
					System.out.println(x - testarray2[j] + " " + testarray2[j]);
				
}
	public static void main(String[] args) {
		// Test your checksum() method here
		int[] testarray1 = {1, 10, 45};
		int[] testarray2 = {-8, 4, 6};
		int x = 16;
		int y = 70;
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ x + "?");
		checksum(testarray1, testarray2, testarray1.length, testarray2.length, x); 
		// should print true
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ y + "?");
		checksum(testarray1, testarray2, testarray1.length, testarray2.length, y);
		// should print false
		
	}

}

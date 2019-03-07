import java.util.Arrays;
public class Problem4 {
	
	public static int recursivearray(int A[], int n)
	{
		// Complete this method to create a new array B[]
		// B[0] = A[0]
		// B[1] = A[0] * A[1]
		// B[2] = A[0] * A[1] * A[2]
		// ...
		// B[i] = A[0] * A[1] *...* A[i]
		// Feel free to add more parameters to this method
		// A recursive method is expected
		// A non-recursive method will be scored out of 10 points
		     	
		if(n == 0)
				return A[n];// n==0 , A[0]= B[0]		
				else
					return ( A[n] * recursivearray(A, n-1));//recursive function
			}
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method
		int[] givenarray = {1, 2, 3, 4, 5, 6};	
		int[] outputarray = new int[givenarray.length];
		
		// Add statements here to invoke the recursivearray method
		for (int i = 0 ; i < givenarray.length;i++){
		outputarray[i]=	recursivearray(givenarray, i);
		}
		
		
		// Test your method
		System.out.println("B "+ Arrays.toString(outputarray));
		// Your method should return {1, 2, 6, 24, 120, 720}
		
		
		
	}
}



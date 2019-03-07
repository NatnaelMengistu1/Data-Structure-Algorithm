
public class Problem3 {
	public static int lastIndexFound ;
	public static String charArrayToString(char[] A, int startIndex) {
	    return new String(A);
		// This method converts elements at index from startIndex to lastIndex in a char array into a string
	}
	
	
	public static void where(char[] A, int startIndex)
	{
		// Complete this method to find the rightmost occurence of a string in an array
		// Feel free to add more parameters to this method
		// A recursive method is expected. A non-recursive method will be scored out of 10 points.
		 
		if ( startIndex >= A.length){
			
			return ;
		
				
				
				
			}
		
			if (A[startIndex]== 'm' && startIndex + 5 < A.length){
				if (A[startIndex + 1] == 'a' && A[startIndex + 2] == 'r' && A[startIndex + 3] == 'i' && A[startIndex + 4] == 's'&& A[startIndex + 5]== 't')
					lastIndexFound = startIndex;
				where(A, startIndex +5 );
				
			}
			
			where (A , startIndex+1);
	}
	
	public static void main(String[] args) {
		char[] givenarray = {'a', 'm', 'a', 'r', 'i', 's', 't', 'm', 'a', 'r', 'i', 's', 't', 'v', 'h', 'e'};	
		
		// Test your method
		where (givenarray ,0);
		System.out.println("The rightmost occurence of 'marist' in the given array is at index "+ lastIndexFound );
		// Your method should return 7
		
		
		
	}
}


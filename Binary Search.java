public class Problem2 {

	public static int binarySearch(double[] A, double x ,boolean searchFirst)
	{
		// given sorted array A, and a value x, return the number of times x occurs in A
		// complete the method count() here
		// O(log n) expected
		// O(n) or slower will be graded out of 10 points
		// search space is A[left..right]
      
	  int left = 0;
          int right = A.length - 1;
		
                  int result = -1;// initialize the result by -1
         
        while (left <= right)// iterate till search space contains at-least one element
        {
            // find the mid value in the search space and compares it with key value
            int mid = (left + right) / 2;
             
            if (x == A[mid])// if key is found, update the result
            {
                result = mid;
                
                if (searchFirst) { // go on searching towards left (higher indices)
                    right = mid - 1;
                }
                
                else {// go on searching towards right (righter indices)
                    left = mid + 1;
                }
            }
            
            else if (x < A[mid]) {// if key is less than the mid element, discard right half
                right = mid - 1;
            }
             
            else {// if key is more than the mid element, discard left half
                left = mid + 1;
            }
        }
       
        return result;// return the found index or -1 if the element is not found
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test your count() method here
		
		double[] A = {1.3, 2.1, 2.1, 2.1, 2.1, 6.7, 7.5, 7.5, 8.6, 9.0};
		double t1 = 2.1;
		double t2 = 7.5;
		double t3 = 1.3;

        int first = binarySearch(A, t1, true);    // true for first occurrence
        int last = binarySearch(A, t1, false);    // false for last occurrence
               
 
        int count = last - first + 1;
 
        if (first != -1) {
		
	//outputs how many times t1 (2.1) appears 
		
		System.out.println(t1+" appears "+ count + " times!");
		//System.out.println(t2+" appears "+ count + " times!");
		//System.out.println(t3+" appears "+ count + " times!");
		
		
	}

}
}
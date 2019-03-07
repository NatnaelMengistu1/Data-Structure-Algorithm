import java.util.Arrays;

public class problem2 {
    public static void find(int [] A){

/*
		Input: an array A of n integers (positive, negative, or 0), elements sorted in ascending order.
		Output: if there exists a majority element.
		An element is a majority if it appears more than n/2 times. For example, if the input list is: 
		{0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7}
		The output should be true, as 0 appears 6 times (>n/2 = 11/2 times).
		However, if the input list is:
		{0, 0, 0, 1, 1, 2, 3, 10, 10}
		The majority element does not exist.
		By changing the input we are able to see the output of this algorithm
		*/


    if(A.length==0)
        return;
    boolean found = false;
    Arrays.sort(A);
    int count = 1;
    int x = A[0];
    //searches if an element with a count more than half the length exists
    for (int i = 1; i <A.length ; i++) {
        if(x==A[i]){
            count++;
            //checks if count exists 
            if(count>A.length/2) {
                System.out.println("Does there exist a majority element in A? " + x);
                found = true;
                break;
            }
        }else{
            x = A[i];
            count = 1;
        }

    }
    //if a majority element does not exist this will be the output
    if(!found)
        System.out.println("No majority element exists in A");
}

    public static void main(String[] args) {
// Test your majority method
//we input the array we want to find the majority element of
        int [] A = {0,0,0,1,1,2,3,10,10};
        find(A);
    }
}




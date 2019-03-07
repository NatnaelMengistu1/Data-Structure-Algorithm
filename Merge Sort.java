//Natnael Mengistu
public class LinkedList {
	
	
	// The LinkedList Node class
	private class Node{
		
		int data;
		Node next;
		
		Node(int gdata)
		{
			this.data = gdata;
			this.next = null;
		}
		
	}
	
	// The LinkedList fields
	Node head;
	
	// Constructor
	LinkedList(int gdata)
	{
		this.head = new Node(gdata);
	}
	
	public void Insertend(int gdata)
	{
		Node current = this.head;

		while(current.next!= null)
		{
			current = current.next;
		}
		
		Node newNode = new Node(gdata);
		current.next = newNode;
		
	}
	
	public void Listprint()
	{
		Node current = this.head;

		while(current!= null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
		
	}
	

		// Sort given Linked list using Merge Sort algorithm
	public Node Listsort(Node h)
	{
	// Complete this method to sort a Linked list
	// Return the first Node in the sorted list
	// Feel free to change the method type, add/remove parameters
	// Full credit (30 points) will be awarded for an algorithm that is O(nlog n). 
	// Algorithms that are O(n^2) slower will be scored out of 10 points.
		
		// Base case : 
		if (h == null || h.next==null)
			return h;
		
		// Split h into 'A'and 'B' sublists 
		Node A = h;
		Node B = h.next;
		
		while((B!= null)&& (B.next!= null)){
			h = h.next;
			B = (B.next).next;
					
			}
		B = h.next;
		h.next = null;
		//merge the two sorted lists together 
		return mergeSorted(Listsort(A),Listsort(B));
	
	
	}
	
	public Node mergeSorted(Node A,Node B)
	{
	 Node temp = new Node(0);	
	 Node head = temp;
	 Node C = head;
	 
	 	while ((A!= null) && (B!= null))
	 		/* Pick either a or b, and recur */
	 	{
	 		if (A.data <= B.data)
	 		{
	 		C.next = A;
	 		C = A;
	 		A=A.next;
			}
	 		else {
	 			
	 		C.next = B;	
	 		C = B;
	 		B = B.next;
	 		}
	 	}
		C.next = (A == null) ? B:A;
		return head.next;
		
			}
	
	
	
	public static void main(String[] args) {
		
		LinkedList exlist = new LinkedList(0);
		
		exlist.Insertend(1);
		exlist.Insertend(5);
		exlist.Insertend(2);
		exlist.Insertend(7);
		exlist.Insertend(10);
		exlist.Insertend(3);
		
		exlist.Listprint();
		//output: 0 1 5 2 7 10 3
		exlist.Listsort(exlist.head);
		exlist.Listprint();
		//output should be: 0 1 2 3 5 7 10
		
		
	}
	
	
	

}

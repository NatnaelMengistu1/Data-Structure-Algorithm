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
			
			Node newnode = new Node(gdata);
			current.next = newnode;
			
		}
		
/*This function prints the contents of linked list*/
		
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
		
		public void Removemin(int position) {
		// Complete this method to remove the minimum value in a linkedlist
			
			if (head == null) 
	            return; 
	  
	        
	        Node temp = head; 	  // Store head node 
	        
	        if (position == 0) // If head needs to be removed 
	        { 
	            head = temp.next;   // Change head 
	            return; 
	        } 
	  	         
	        for (int i=0; temp!=null && i<position-1; i++) // Find previous node of the node to be deleted
	            temp = temp.next; 	  
	         
	        if (temp == null || temp.next == null) // If position is more than number of nodes
	            return; 	  
	                
	        Node next = temp.next.next; // Node temp->next is the node to be deleted, Store pointer to the next of node to be deleted 
	  
	        temp.next = next; 
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
			
			exlist.Removemin(0);
			
			exlist.Listprint();
			//output should be: 1 5 2 7 10 3
			
			
		}
		
		

}

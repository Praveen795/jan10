package jan10;



//create strcture of linked list_____________***
class Node{
	int data;
	Node next;
	
	public Node(int data) {
	
		this.data = data;
		this.next =null;
	}
	
	
}

public class jan10 {
	
	public static void main(String[] args) {
	//  add new node to the first position of linked list_________________________________***
		
			Node head=new Node(3);
			System.out.println(head);
			head.next=new Node(2);
			head.next.next=new Node(21);
			head.next.next.next=new Node(76);
			
		
			
			Node newnode=new Node(2);
			newnode.next=head;
			System.out.println(newnode.next);
			System.out.println(head);

	// add new node to the last position of linked list__________________________________***
			System.out.println();
			Node newnode1=new Node(76);
			
			head.next.next.next.next=newnode1;
			System.out.println("last added node");
			System.out.println(newnode1);
			System.out.println(head.next.next.next.next);
			
	// add new node midel position of linked list_____[position 3]_____________________________________***
			
			Node newnode3=new Node(121);
			newnode3.next=head.next.next.next;
			head.next.next=newnode3;
			System.out.println();
			System.out.println("node added in midel position");
			System.out.println(newnode3);
			System.out.println(head.next.next);
		
	}

}

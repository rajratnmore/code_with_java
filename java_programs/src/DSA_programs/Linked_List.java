package DSA_programs;

public class Linked_List {
	Node head;
	private int size=0;
	
	// New Node creation
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
		}
			
	}

	// Add new node into Linked List at Last
	void addNodeLast(String data) {
		
		Node n = new Node(data);
		
		if(head == null) {
			head = n;
			size++;
		}else if(head.next == null) {
			head.next = n;
			size++;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			size++;
		}		
		
	} 
	
	// Add new node into Linked List at First
	void addNodeFirst(String data) {
		
		Node n = new Node(data);
		
		if(head == null) {
			head = n;
			size++;
		}else {
			n.next = head;
			head = n;
			size++;
		}
	}
	
	// Get Linked List 
	void getNode() {		
		if(head == null) 
			System.out.println("List is empty");
		else if(head.next == null)
			System.out.print(head.data+" -> "+head.next);
		else {
			Node temp = head;
			while(temp.next != null) {
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
			System.out.print(temp.data+" -> "+temp.next);
		}
		System.out.println();
	}
	
	private void reversePrint(Node temp) {
		if(temp.next == null) {
			System.out.print(temp.data+" -> ");
			return;
		}
		reversePrint(temp.next);
		System.out.print(temp.data+" -> ");
	}
	
	//	Get Linked List in Reverse 
	void getNodeRevese() {		
		if(head == null)
			System.out.println("List is empty");
		else if(head.next == null) 
			System.out.print(head.data+" -> "+head.next);
		else {
			Node temp = head;
			reversePrint(temp.next);
			System.out.print(temp.data+" -> null");
		}
		System.out.println();
	}
	
	// Remove Last Node
	void removeNodeLast() {
		if(head == null)
			System.out.println("Linked List is empty");
		else if(head.next == null) {
			head = null;
			size--;
		}
		else {
			Node temp = head;
			Node t = null;
			while(temp.next != null) {
				 t = temp;
				temp = temp.next;
			}
			t.next = null;
			size--;
		}
	}
	
	// Remove First Node
	void removeNodeFirst() {
		if(head == null)
			System.out.println("List is Empty");
		else if(head.next == null) {
			head = null;			
			size--;
		}
		else {
			head = head.next;
			size--;
		}
	}
	
	// Update List 
	void setNode(String data,String newData) {
		if(head == null)
			System.out.println("List is Empty");
		else if(head.next == null) {
			if(head.data == data)
				head.data = newData;
			else
				System.out.println("data is not present");
		}else {
			Node temp = head;
			boolean flag = true;
			while(temp.data != data) {
				temp = temp.next;
				if(temp == null) {
					flag = false;
					break;
				}
			}
			if(flag)
				temp.data = newData;
			else
				System.out.println("data is not present");
		}		
	}
	
	// List Clear
	void clearList() {
		head = null;
		size=0;
	}
	
	// Contains
	boolean isContains(String data) {
		if(head == null)
			return false;
		else if(head.next == null) {
			if(head.data == data)
				return true;
			else
				return false;
		}
		else {
			Node temp = head;
			boolean flag = false;
			while(temp.next != null) {
				if(temp.data == data) {
					flag = true;
					break;
				}
				temp = temp.next;
				
			}
			return flag;
		}		
	}
	
	// Size of List
	int getSize() {
		System.out.println(size);
		return size;
	}
	
	Node getHead() {
		return head;
	}
	public static void main(String[] args) {
		
		Linked_List li = new Linked_List();
		li.addNodeLast("Rajratn");
		li.addNodeLast("Sagar");
		li.addNodeLast("Rahul");	
		li.addNodeLast("Nirya");	
		li.addNodeLast("Rohit");	
		li.addNodeFirst("Narendra");
		li.getNode();	
		li.getSize();
		
	}

}


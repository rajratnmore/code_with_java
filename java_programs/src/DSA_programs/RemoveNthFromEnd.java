package DSA_programs;
import java.util.*;
import DSA_programs.Linked_List;
import DSA_programs.Linked_List.Node;


public class RemoveNthFromEnd extends Linked_List{
	
	Node removeNthFromEnd(Node head,int n) {
		if(head == null)
			return head;
		int size = 1;
		if(head.next == null) {
			head = null;
			return head;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
			size++;
		}
		if(n <= size) {
			int visit=0;
			temp = head;
			while(visit < size-n-1) {
				temp = temp.next;
				visit++;
			}
			temp.next = temp.next.next;
		}
		return head;		
	}
	
	boolean isPalindrome() {
		Node temp = head;
		ArrayList<String> arr = new ArrayList<>();
		while(temp.next != null) {
			arr.add(temp.data);
			temp = temp.next;
		}
		arr.add(temp.data);
		int back = arr.size()-1;
		for(int i=0; i<=back; i++,back--) {
			if(arr.get(i) != arr.get(back))
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		RemoveNthFromEnd re = new RemoveNthFromEnd();
		re.addNodeLast("Rajratn");
		re.addNodeLast("Sagar");
		re.addNodeLast("Raju");
		re.addNodeLast("Sagar");
		re.addNodeLast("Rajratn");
		re.getNode();
//		Node newhead = re.getHead();
//		re.removeNthFromEnd(newhead,3);
//		re.getNode();
		if(re.isPalindrome())
			System.out.println("List is palindrom");
		else
			System.out.println("List is not palindrom");
	}

}

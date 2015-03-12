
public class ReverseLinkedList {
	
	public static void main(String[] args) {
		SLinkedList node=new SLinkedList(1);
		node.addTail(2);
		node.addTail(3);
		node.addTail(4);
		node.addTail(5);
		node.addTail(6);
		node.printList();
		node=node.reverse();
		node.printList();
	}
	

}

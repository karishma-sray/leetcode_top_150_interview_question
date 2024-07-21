package singleLinkedList;

public class Single_LL_Add_First_Node_and_Print {
	Node head;
	class Node{
		//Instance variables
		String data;
		Node next;
		
		//create parametric constructor 
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void addFirstNode(String data) {
		//add new node on the 1st position of LL as head node
		Node newNode = new Node(data);
		//If any linked list node is not present then create a new Head node
		if(head == null) {
			head = newNode;
			return;
		}
		//if LL is present ie; Head node is present
		newNode.next = head;//connect next pointer of new node to head
		head = newNode;//Now make the new node as head 
	}
	
	public void printLL() {
		if(head == null) {
			System.out.println("LinkedList is not present/LinkedList is empty.");
			return;
		}
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.print("Null");
	}
	public static void main(String[] args) {
		Single_LL_Add_First_Node_and_Print list = new Single_LL_Add_First_Node_and_Print();
		list.addFirstNode("LinkedList");
		list.addFirstNode("single");
		list.addFirstNode("am");
		list.addFirstNode("I");
		list.addFirstNode("hi");
		list.printLL();
	}

}

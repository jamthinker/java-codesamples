package datastructures;

class node {
	int data;
	node next;
	node prev;
}
public class Dlist {

	node head;
	node tail;
	public Dlist(){
		this.head = null;
		this.tail = null;
	}
	public void insert(int data){
		node newnode = new node();
		newnode.data = data;
		if (head == null){
			head = newnode;
			tail = newnode;
			newnode.next = null;
			newnode.prev = null;
		}
		else{
			//tail = head;
			newnode.next = head;
			newnode.prev = null;
			head.prev = newnode;
			head = newnode;
		}
	}
	public void insertlast(int data){
		node newnode = new node();
		newnode.data = data;
		newnode.next = null;
		tail.next = newnode;
		newnode.prev = tail;
		tail = newnode;
	}
	public void printlist(){
		node temphead = head;
		do{	
			
			node printnode = head;
			System.out.println(printnode.data);
			head = head.next;
			
		}while(head != null);
		head = temphead;
		
		node temptail = tail;
		do{
			node printtnode = tail;
			System.out.println(printtnode.data);
			tail = tail.prev;
		}while(tail != null);
		tail = temptail;
	}
	public static void main(String... args){
		Dlist list = new Dlist();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertlast(4);
		list.printlist();
		list.printlist();
	}
}

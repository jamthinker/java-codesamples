package datastructures;

import java.util.ArrayList;

class node {
	node left;
	node right;
	int data;
	public node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}

class StackFullException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StackFullException(String e){
		System.err.println(e);
	}
	
}

class Stack<T>{
	int size;
	private ArrayList<T> list;
	private int position;
	
	public Stack(int size){
		this.size = size;
		list =  new ArrayList<T>(size);
		this.position = 0;
	}
	void push(T t){
		if (position > size)
			throw new StackFullException("stack is full");
		list.add(t);
		position++;
	}
	T pop(){
		if(position == 0)
			return null;
		T t = list.get(position);
		position--;
		return t;
	}
	
}

public class Tree {

	node root;
	public Tree(){
		this.root = new node(0);
	}
	
	public void traversal(){
		Stack<node> stack = new Stack<node>(100);
		
		node curr = root;
		
		if (root == null)
		    return;
		
		while(curr != null){
			stack.push(curr);
			curr = curr.left;
				
		}
		while(stack.size > 0){
			curr = stack.pop();
			if (curr.right != null){				
				curr = curr.right;
				
				while(curr != null){
					stack.push(curr.right);
					curr = curr.right;
				}
			}
		}
	}

	public static void main(String... args){
		
		Tree tree = new Tree();
		tree.root.left = new node(1);
		tree.root.right = new node(2);
		tree.root.left.left = new node(3);
		tree.root.right.right = new node(4);
		tree.traversal();
		
	}
}



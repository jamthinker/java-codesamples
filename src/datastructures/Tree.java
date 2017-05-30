package datastructures;

import java.util.ArrayList;

class stack<T>{
	int size;
	private ArrayList<T> list;
	private int position;
	
	public stack(int size){
		this.size = size;
		list =  new ArrayList<T>(size);
		this.position = 0;
	}
	void push(T t){
		if (position > size)
			throw new StackOverflowError("stack is full");
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

public class Tree {

	node root;
	public Tree(){
		this.root = new node(0);
	}
	
	public void insert(int data){
		node newnode = new node(data);
		node leftnode = root.left;
		node righnode = root.right;
		node curr = root;
		if (root == null)
			root = newnode;
		while(curr != null){
			if (curr.data < newnode.data)
				curr = curr.right;
			else
				curr = curr.left;
				
		}
	}
}

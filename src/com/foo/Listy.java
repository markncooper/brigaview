package com.foo;

public class Listy {
	Node head;
	Node tail;

	public void push(Node node){
		node.next = head;
		head = node;
	}

	public Node pop(){
		Node result = head;
		head = head.next;
		return result;
	}
	
	public void pushTail(Node node){
		if (tail == null){
			tail = node;
			head = node;
		}else{
			tail.next = node;
			tail = node;
			node.next = null;
		}
	}

	public static Listy copy(Listy old){
		Listy newList = new Listy();
		Node current = old.head;
		while (current != null){
			newList.pushTail(new Node(current.data));
			current = current.next;
		}
		return newList;
	}
	
	public String dump(){
		StringBuffer out = new StringBuffer();
		Node current = head;
		while (current != null){
			out.append(current.data);
			out.append("->");
			current = current.next;
		}
		return out.toString() + "null";
	}
}

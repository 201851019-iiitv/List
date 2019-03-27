package day1example;

public class LinkedList {
	Node firstnode;
	int count=0;
	class Node{
		int data;
		Node next;
       }
public void insertAtFirst(int data){
		Node new_node=new Node();
		new_node.data= data;
		new_node.next=firstnode;
		firstnode=new_node;
		count++;
		
	}/* insert a new node to previous node*/ 
public  void push(int index,int data) {
	Node prev_node=new Node();
	Node temp=new Node();
	temp=firstnode;
	for(int i=0;i<=index-2;i++) {
		temp=temp.next;	
	}
	prev_node=temp;	
	if (prev_node == null) 
    { 
        System.out.println("The given previous node cannot be null"); 
        return; 
    } 
	Node new_node1=new Node();
	new_node1.data=data;
	new_node1.next=prev_node.next;
	prev_node.next=new_node1;	
     }
public void insertAtEnd(int data) {
	Node new_node=new Node();
Node current_node=firstnode;
while(current_node.next!=null) {
	current_node=current_node.next;	
}
	current_node.next=new_node;
	new_node.data=data;
	count++;
}
public void Print() {
	Node temp_node=new Node();
	 temp_node=firstnode;
	while(temp_node!=null) {
		System.out.println(temp_node.data+" "); 
        temp_node = temp_node.next;
	}
}
public boolean exit() {
	return false; 	
}
public void pop(int index) {
	if(index==0) {
		firstnode=firstnode.next;
	}
	else {
	Node prev_node=new Node();
	Node temp=new Node();
	temp=firstnode;
	for(int i=0;i<=index-2;i++) {
		temp=temp.next;	
	}
	prev_node=temp;
	prev_node.next=prev_node.next.next;
}
}	
	
}

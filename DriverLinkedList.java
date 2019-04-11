import java.util.*;

import day1example.LinkedList.Node;

public class Driver2 {

	public static void main(String[] args) {
		Linkedlist2 ob=new Linkedlist2();
		Scanner sc=new Scanner(System.in);
		int choice;
		boolean yes=true;
		while(yes) {
			
		System.out.println("1.list insert at any position\n2.print list\n3.exit\n4.pop element ");
		System.out.println("please enter the choice");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:System.out.println("enter the element");
                int value1=sc.nextInt();
                System.out.println("enter the index");
                int index2=sc.nextInt();
                ob.insert(index2,value1);
                break;
		case 2:
	     ob.traverse();
	     break;
		case 3:
			 yes=ob.exit();
			break;
		case 4:
			System.out.println("enter the index");
			int p=sc.nextInt();
			ob.pop(p);
			break;
		  
		}
		if(yes==false)
			break;
	}

	}

}


import java.util.*;

public class Driver1 {

	public static void main(String[] args) {
		ArrayList1 ob=new ArrayList1();
		Scanner sc=new Scanner(System.in);
		int choice;
		int f=1;
		while(f==1) {
		System.out.println("1.Add element\n2.Add with index\n3.Remove element\n4.search element\n5.traverse array\n6.exit ");
		System.out.println("please enter the choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("enter the element");
		         int  value= sc.nextInt();
		         ob.Add(value);
		         f=1;
		           break;
		case 2:System.out.println("enter the element");
		        System.out.println("enter the index");
                int  value1=sc.nextInt();
                int index=sc.nextInt();
                  ob.Add(value1,index);
                  f=1;
                  break;
		case 3:
			System.out.println("enter the index");
			int index1=sc.nextInt();
		     ob.remove(index1);
		     f=1;
		     break;
		case 4:System.out.println("enter the index");
		int index2=sc.nextInt();
	     ob.search(index2);
	     f=1;
	     break;
		case 5:
	     ob.traverse();
	     f=1;
	     break;
		case 6:
			f=1;			 
			break;
		  
		}}

	}

}

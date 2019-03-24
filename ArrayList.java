package finalimplents;

import java.util.Scanner;

public class ArrayList implements List {

	Scanner sc=new Scanner(System.in);
Object arr[];
Integer size;
Integer buffer;
	ArrayList() {
      size=0;
      buffer=5;
      arr = new Object[buffer];
	}
		
	public void Add(Object element){
		arr[size]=element;
		size++;
		if(arr[size]==buffer) {
		Object arr2[]=new Object[buffer*2];
		for(int i=0;i<size;i++) {
			arr2[i]=arr[i];
		}
		buffer=buffer*2;
		arr=arr2;	
			
		}
		System.out.println(arr[0]);
	}
	public void Add(Object element,Integer index) {
		element =sc.nextInt();
		index=sc.nextInt();
		if(arr[size]==buffer) {
			Object arr2[]=new Object[buffer*2];
			for(int i=0;i<size;i++) {
				arr2[i]=arr[i];
			}
			buffer=buffer*2;
			arr=arr2;	
				
			}
		try {
			if(index>size||index<0) {
			throw new ArrayIndexOutOfBoundsException();
			}
			else if(index==size)
		{
			arr[size]=element;
			size++;
		}
		else {
			for(int j=size-1;j>=index;j++) {
				arr[j+1]=arr[j];
			}
			arr[index]=element;
			size++;
		}	
	}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter a valid index");
			index=sc.nextInt();
			element=sc.hasNextInt();
			Add(element,index);
		}
			
		}
	 public void remove (Integer index)
	{
		index=sc.nextInt();
		try {
			if(index>size-1||index<0) {
			throw new ArrayIndexOutOfBoundsException();
			}
			else if(index==size-1) {
				arr[size-1]=0;
				size--;
			}
			else {
				for(int k=index;k<=size;k++) {
				arr[k]=arr[k+1];	
				}
			}
			size--;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter a valid index");
			index=sc.nextInt();
			remove(index);
		}
	}
	 public void reverse() {
		 Object arr2[]=new Object[size];
		 int j=0;
		 for(int m=size-1;m>=0;m++) {
			 arr2[j]=arr[m];
			 j++;
		 }}
		 public void traverse() {
			 for (Integer i = 0; i < size; i++) {
		            System.out.println(arr[i]);
		        }
		        System.out.println("size of array list is" + " " + size);
		 }
	 }



package day1example;
 class ArrayList1 implements List1{
	Object arr[];
	int index;
	int size;
	int buffer;
	ArrayList1(){
		size=0;
		buffer=5;
		arr=new Object[buffer];	
	}
	public void checkindex()
	{
	Object arr2[]=new Object[buffer*2];
	for( int i=0;i<size;i++) {
			arr2[i]=arr[i];
		 }
	arr=arr2;
	buffer=buffer*2;
			}
public void Add(int value) {
		if(size==buffer)
		{   checkindex();
		arr[size]=value;
		size++;
		}
		else {
			arr[size]=value;
			size++;		
		}
		
	}
public void Add(int value ,int index) {
	if(size==buffer)
	{   checkindex();
	}
if(index>=0||index<=size) {
	for(int j=size;j>=index;j--) {
		arr[j+1]=arr[j];
	}
	arr[index]=value;
	size++;
	
}
else {
	 BoundException obj =new BoundException();
	  obj.PrintError();	
}

}
public void  remove(int index) {
	if(index>=0||index<=size) {
		for(int j=size-1;j>=index;j--) {
			arr[j]=arr[j+1];
		}
		size--;
		
	}
	else {
		 BoundException obj =new BoundException();
		  obj.PrintError();	
	}
	}
	
public void traverse() {
	for(int b=0;b<size;b++) {
	System.out.println(arr[b]);	
	}
}

public void search(int value) {
	System.out.println("hi");	
}
public boolean exit() {
	return false;
}
}

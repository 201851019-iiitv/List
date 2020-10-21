
//------------Define class-----------------------------------------------------------\\
class ArrayList1 implements List1{
	Object arr[];
	int index;
	int size;
	int buffer;
	ArrayList1(){
		size=0;
		buffer=5;
		arr=new Object[buffer];	//Ambesh
	}
	
	
//---------------------------Check Index is valid or not--------------------------\\	
	
	
	public void checkindex()
	{
	Object arr2[]=new Object[buffer*2];
	for( int i=0;i<size;i++) {
			arr2[i]=arr[i];
		 }
	arr=arr2;
	buffer=buffer*2;
			}
//-------------------------------------------Add value at last----------------------\\	
	
	
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
	
//----------------------Add value at a specific index--------------------------------------\\	
public void Add(int value ,int index) {
	if(size==buffer)
	{   checkindex();
	}
	try{
             if(index<0||index>size) {
	       BoundException ob = new BoundException();
		  throw ob;
}
for(int j=size;j>=index;j--) {
		arr[j+1]=arr[j];
	}
	arr[index]=value;
	size++;
	
}
		
}  //--------------------exception handling-----------------------\\
	catch(BoundException o) {
			o.PrintError();
			return;

}
	
	
//-------------------------------remove last index------------------------------\\	
public void  remove(int index) {
		try{
             if(index<0||index>size) {
	       BoundException ob = new BoundException();
		  throw ob;
}
	for(int j=size-1;j>=index;j--) {
			arr[j]=arr[j+1];
		}
		size--;
		
	}
	catch(BoundException o) {
			o.PrintError();
			return;
	}
	
//--------------------------------------print all element  in list-----------------------\\	
	
public void traverse() {
	for(int b=0;b<size;b++) {
	System.out.println(arr[b]);	
	}
}
	
	
//-----------------------------------search a element in list--------------------------\\	

public void search(int value) {
	for(int p=0;p<size;p++){
		if(arr[p]==value){
			return p;
			break;
		}
		else
			System.out.println("element not found");
}
}
		
}

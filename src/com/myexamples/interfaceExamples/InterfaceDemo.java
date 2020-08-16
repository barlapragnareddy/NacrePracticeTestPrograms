package com.myexamples.interfaceExamples;
interface A{
	//empty interface
}
interface Interface1{
   int x=10;
   float y=20;
	public void sum(int a,int b);
	public float sum(int a,float b);
	public void display();
	public default int ab(){
		return 2;
	}
	
}

interface Interface2{
	public void display();
	
}
interface Interface3 extends Interface2{
	public Interface2 getResult();
}

class InterfaceClass implements Interface1,Interface3{
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public float sum(int a,float b) {
		return a+b;
	}
	
	public Interface1 display(Interface1 ii,int a,float b) {
		float c=ii.x;
		int d=(int)ii.y;
		System.out.println(c);
		System.out.println(d);
		return new InterfaceClass();
		//System.out.println("I am interface-2");
	}
	public void show() {
		System.out.println("I am interface class");
		//InterfaceClass ii=new InterfaceClass();
		
		
	}
	@Override
	public void display() {
System.out.println("I am interface 1");		
	}
	public Interface2 getResult() {
		Interface3 ifc=new InterfaceClass();
		return ifc;
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		InterfaceClass ic=new InterfaceClass();
		ic.display();
		ic.sum(1, 2);
		float b=ic.sum(2, 3.3f);
		System.out.println(b);
		int res=ic.ab();
		System.out.println(res);
		Interface1 i1=new InterfaceClass();
		i1.sum(2,4);
		i1.sum(2, 4.4f);
		Interface1 i2=ic.display(i1,2,3.4f);
		System.out.println(i2);
		
		//i1.display(i1);
		i1.display();
		//i1.show();
        i1.sum(1,4);
      //  Interface1 i2=new Interface1();
        
        
	}

}

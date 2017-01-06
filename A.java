package com.acad.basic;

class C{
public void test(){
System.out.println("C");
}
}
  
class B extends C{
public void test(){
System.out.println("B");
}
}
  
public class A extends B{
public void test(){
	System.out.println("A");
	super.test();

}
public static void main(String[] args) {

}
//ANSWER-f. It is not possible to invoke test() method defined in C from a method in A.
}
		
	


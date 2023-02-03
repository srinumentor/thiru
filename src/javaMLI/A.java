package javaMLI;

class A {
int a=10;
int b=20;
public void m1() {
	System.out.println("M1 Executed");	
}
}
class B extends A{
int x=30;
int y=40;
public void m2() {
	System.out.println("m2 executed");
	System.out.println(a+b);
}
}
class C extends B{
public void m3() {
System.out.println("m3 executed");
System.out.println(x+y);//class b
System.out.println(a+b);//class a
}

 public static void main(String args[]) {
	C obj = new C();
	obj.m1();
	obj.m2();
	obj.m3();
 }
 }
package SLI;
 class A{
	 public void test() {
	System.out.println("hai");
	System.out.println("parent class");
	 }
}
  class B extends A{
	 public static void main(String[]args) {
		 B s=new B();
		 s.test();
	 }
	 
 }

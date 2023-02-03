package override;

public class OverRide1 extends Override {
public void add(int a,int b) {
	System.out.println(a-b);
	System.out.println("New Fun:");
}
public static void main(String args[]) {
	Override  obj =new Override ();
	obj.add(20, 30);
}
}

package extends1;

public class abc {

	public static void main(String []args) {
		
		 abc obj =new abc();
		obj.m1();
		 
		m2();
		 abc2 obj1 =new abc2();
		 obj1.p2();
		 obj1.m2();
		 obj1.m1();
		 
	}
	public void m1() {
		System.out.println("method m1");
	}
	
  public static  void m2() {
	System.out.println("method m2");
	}

  public  void p2() {
	System.out.println("method p2");
}
}

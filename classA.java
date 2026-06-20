package access_modifier;

public class classA {

	private int a = 10;					//private
	int b = 20;							//default
	protected int c = 30;				//protected
	public int d = 40;					//public


	public static void main(String []args) {
		classA obj=new classA();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		
		
	}
	
	private void m1() {
		System.out.println("private m1():-"+a);
	}
	
	void m2() {
		System.out.println("default m2():-"+b);
	}
	
	protected void m3() {
		System.out.println("protected m3():-"+c);
	}
	
	public void m4() {
		System.out.println("public m4():-"+d);
	}

}


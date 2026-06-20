package chaining1;

public class methodChaining {

	public static void main(String []args) {
		methodChaining obj=new methodChaining();
		obj.m().m1().m2().m3();
	}
	
	public methodChaining m() {
		System.out.println("method m");
		
		return this;
	}
	
public methodChaining m1() {
	System.out.println("method m1");
	
	return this;
	}

public methodChaining m2() {
	System.out.println("method m2");
	
	return this;
}


public methodChaining m3() {
	System.out.println("method m3");
	
	return this;
}
}

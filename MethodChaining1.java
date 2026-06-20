package chaining1;

public class MethodChaining1 {

	public static void main(String []args) {
		 MethodChaining1 obj=new  MethodChaining1();
		obj.m();
	} 
	
	public  MethodChaining1 m() {
		System.out.println("method m");
		
	    return  m1();
	}
	
public  MethodChaining1 m1() {
	System.out.println("method m1");
	
	return m2();
	}

public  MethodChaining1 m2() {
	System.out.println("method m2");
	
	return m3();
}


public MethodChaining1 m3() {
	System.out.println("method m3");
	
	return this;
}
}

package chaining1;

public class constructorChaining extends constructorchaining2 {

	int a;
	public static void main(String[]args) {
		constructorChaining obj=new constructorChaining();
		
	}
	
	public constructorChaining() {
		this(45);
		System.out.println("no argument constructor");
	}
	
	
public constructorChaining(int a) {
	super();
	System.out.println(this.a);
		System.out.println("int constructor");
	}
	
}
/*
////////////////output//////////////
55 int constructor2
no argument constructor2
0 int constructor
no argument constructor
*/
package chaining1;

public class constructorchaining2 {

	public static void main(String[]args) {
		constructorchaining2 obj=new constructorchaining2();
		
	}
	
	public constructorchaining2() {
		this(55);
		System.out.println("no argument constructor2");
	}
	
	
public constructorchaining2(int a) {
	System.out.println(a);
		System.out.println("int constructor2");
	}
	
}
//
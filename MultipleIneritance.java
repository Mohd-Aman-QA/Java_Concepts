package interface1;

public class MultipleIneritance implements  Interface1,Interface2  {
	
	public static void main(String []args) {
		MultipleIneritance obj=new MultipleIneritance();
		obj.m();
		obj.m3();
	
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Interface2 method");
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 method");
	}
	
	public void MultipleIneritance() {
		System.out.println(" MultipleIneritance method");
	}

}

package access_modifier;

public class classB {

	public static void main(String []args) {
		classA obj=new classA();
	//	obj.m1();	                                          //same pcakage other class
		obj.m2();	
		obj.m3();
		obj.m4();
		
		
	}
}

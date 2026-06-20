package accessModifier1;

import access_modifier.classA;

public class classD {

	public static void main(String []args) {
		classA obj=new classA();
	//	obj.m1();	                                                     
	//	obj.m2();      	
	//	obj.m3();	                     //outside package
		obj.m4();
	
		
	}
}

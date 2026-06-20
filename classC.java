package accessModifier1;
import access_modifier.classA;

public class classC extends classA{

	public static void main(String []args) {
		classC obj=new classC();
	//	obj.m1();	                        //sub class/other package
	//	obj.m2();       		
		obj.m3();				
		obj.m4();
		
	}
	
}

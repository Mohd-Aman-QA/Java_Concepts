package encapsulation;

public class T_4_encapsulation {

	public static void main(String[]args) {
		T_3_encapsulation obj= new T_3_encapsulation();
		obj.setvalues(2000, 2, 5);
		System.out.println(obj.getsimpleIntrest());
		System.out.println(obj.getTotalAmountOfIntrest());
	}
}

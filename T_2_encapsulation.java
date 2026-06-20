package encapsulation;

public class T_2_encapsulation {

	public static void main(String[]args) {
		T_1_encapsulation obj=new T_1_encapsulation();
		obj.setage(13);
		System.out.println(obj.getage());
		
		obj.setname("aman");
		System.out.println(obj.getname());
		
		obj.setnum(55, 10);
		System.out.println(obj.getsum());
		System.out.println(obj.getsubtract());
		System.out.println(obj.getmultiply());
	}
}

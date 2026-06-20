package methodoverride1;

public class T2 extends T1 {

	public static void main(String []args) {
		T2 obj =new T2();
		obj.m();
		obj.m(0);
		obj.m('h');
		obj.m(7.8f);
		
		T1 obj1 =new T1();
		obj1.p1();
		obj1.m();
		obj1.m(78);
		obj1.m('j');
		obj1.m(0.6f);
		
	}
	public void m() {
		System.out.println("method m");
	}
	public void m(int a) {
		System.out.println(a);
	}
	public void m(char a) {
		System.out.println(a);
	}
	public static void m(float a) {
		System.out.println(a);
	}
	
}

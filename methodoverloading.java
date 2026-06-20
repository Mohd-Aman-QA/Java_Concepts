package allTopics;

public class methodoverloading {

	public static void main(String[] args) {

		m(34);
		methodoverloading obj = new methodoverloading();
		obj.m(9, 't');
		m("aman");
		obj.m('r', 5.5f);
	}

	public static void m(int a) {
		System.out.println(a);
	}

	public void m(int a, char b) {
		System.out.println(a);
		System.out.println(b);
	}

	public static void m(String a) {
		System.out.println(a);
	}

	public void m(char a, float b) {
		System.out.println(a);
		System.out.println(b);

	}
}

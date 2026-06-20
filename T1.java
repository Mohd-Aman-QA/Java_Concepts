package methodoverride1;

public class T1 {
	
public static void main(String []args) {
	T1 obj =new T1();
	obj.p1();
	obj.m();
	obj.m(78);
	obj.m('j');
	obj.m(0.6f);
 }
      public void p1() {
	System.out.println("p1");
 }

      public void m() {
	System.out.println("aman");
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

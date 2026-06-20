package encapsulation;

public class T_1_encapsulation {

	private int age;
	private String name;
	private int num1;
	private int num2;
	public void setage(int a) {
		age=a;
	}
	public void setname(String a) {
		name=a;
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	public void setnum(int a,int b) {
		num1=a;
		num2=b;
	}
	public int getsum() {
		return num1+num2;
	}
	public int getsubtract() {
		return num1-num2;
	}
	public int getmultiply() {
		return num1*num2;
	}
}

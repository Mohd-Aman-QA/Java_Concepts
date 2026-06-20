package encapsulation;

public class T_3_encapsulation {

	private int amount;
	private int time;
	private int rate;
	private double si1;
	public void setvalues(int a,int b,int c) {
		amount=a;
		time=b;
		rate=c;
	}
	
	public double getsimpleIntrest() {
		System.out.println("Follow these steps for right answer");
		System.out.println("Enter amount ");
		System.out.println("Enter time  (in year) ");
		System.out.println("Enter rate (in % percent) ");
		
		double si=amount*time*rate/100;
		si1=si;
		return si;
	}
	
	public double getTotalAmountOfIntrest() {
		double totalamount=amount+si1;
		return totalamount;
	}
}

package Control_flow_statements;

public class Control_flow_statement {

	public static void main(String[]args) {
		control_if();
		control_else();
		control_if_else_if();
		control_switch();
		control_break();
		control_continue();
		control_arraysearching();
	}
	
	public static void control_if() {
		int a=10;
		if(a>0) {
			System.out.println(a);
		}
	}
	
	public static void control_else() {
		int a=-2;
		if(a>=0) {
			System.out.println(a);
		}
		else {
			System.out.println(a+":is not a positive number");
		}
	}
	
	public static void control_if_else_if() {
		
		int marks=79;
		
		if(marks>=90 &&marks<=100) {
			System.out.println(marks+"First division");
		}
		else if(marks>=80 &&marks<=89){
			System.out.println(marks+":Second division");
		}
		
		else if(marks>=70 &&marks<=79){
			System.out.println(marks+":third division");
		}
		
		else if(marks>=60 &&marks<=69){
			System.out.println(marks+":fourth division");
		}
		
		else if(marks>100){
			System.out.println(marks+":invalid marks");
		}
		else {
			System.out.println(marks+":fail");
		}
	}
	
	public static void control_switch() {
		
		int days=3;
		
		switch(days) {
		case 1: System.out.println("monday");
		break;
		case 2: System.out.println("tuesday");
		break;
		case 3: System.out.println("wednesday");
		break;
		case 4: System.out.println("thursday");
		break;
		case 5: System.out.println("friday");
		break;
		case 6: System.out.println("saturday");
		break;
		case 7: System.out.println("sunday");
		break;
		default : System.out.println("invalid number");
		}
		
		char vowel='a';
		
		switch(vowel) {
		case 'a': System.out.println(" a - is a vowel");
		break;
		case 'e': System.out.println(" e - is a vowel");
		break;
		case 'i': System.out.println(" i - is a vowel");
		break;
		case 'o': System.out.println(" o - is a vowel");
		break;
		case 'u': System.out.println(" u - is a vowel");
		break;
		default : System.out.println("is not a vowel");
		}
	}
	public static void control_break() {
		for(int i=0; i<=10; i++) {
			if(i==5 ) {
				break;
			}
			 System.out.println(i);
		}
	}
	
	public static void control_continue() {
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
			 continue;
			}
	 System.out.println(i+":odd number");

		}
	}
	
	public static void control_arraysearching() {
		  int[] numbers = {40, 50, 20, 30, 60, 70, 60, 80, 90};
	        int searchNum = 70;
	        boolean found=false;
	        for (int num : numbers) {
	            if (num == searchNum) {
	                found = true;
	                break;
	            }
	        }
	        if (found) {
	            System.out.println(searchNum + ": number found");
	        } else {
	            System.out.println(searchNum + ": number not found");
	        }
	    }

		
	}


package array;

public class BasicArray {

	public static void main(String []args) {
		
		System.out.println("integer type array");
		int[] w=new int[9];           //length of an array 9 [length -1 index is 8]
		w[0]=2;
		w[1]=3;
		w[2]=4;
		w[3]=5;
		w[4]=6;
		w[5]=7;
		w[6]=8;
		w[7]=9;
		w[8]=10;
		System.out.println(w[8]);
		System.out.println(w.length);
		
		int[]a={2, 3,4,5,6,4,5,6,7,8,9,  9};
		//   i (0 ,1,2,3,4,5,6,7,8,9,10,11
		System.out.println(a[1]);
		System.out.println(a.length);
		
		System.out.println("string type array");
		String[] s =new String[5];           //length of an array 5 [length -1 index is 4]
		s[0]="aman";
		s[1]="aman1";
		s[2]="aman2";
		s[3]="aman3";
		s[4]="aman4";
		
		System.out.println(s[4]);
		
		String[]s1={"aman","aman1","aman2","aman3","aman4"};
		System.out.println(s[0]);
		System.out.println(s.length);
		
		System.out.println("float type array");
		float[] f =new float[5];           //length of an array 5 [length -1 index is 4]
		f[0]=0.9f;
		f[1]=3.4f;
		f[2]=7.4f;
		f[3]=3.445f;
		f[4]=4.4f;
		
		System.out.println(f[3]);
		
		float[]f1={4.5f,45.4f,3.6f,5.7f,8.9f,2.1f,23.4f,1.2f};
		System.out.println(f1[3]);
		System.out.println(f1.length);
		
		System.out.println("char type array");
		char[] c =new char[5];           //length of an array 5 [length -1 index is 4]
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		c[4]='e';
		
		System.out.println(c[2]);
		
		char[]c1={'a','b','c','d','e','f','j','k','l','m',};
		System.out.println(c1[4]);
		System.out.println(c1.length);
	}
	
}

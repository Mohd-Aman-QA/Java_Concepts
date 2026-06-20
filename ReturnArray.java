package array;

public class ReturnArray {

	 public static void main(String[] args) {
		 PrintArray();
	 }
	 
	 public int [] getArray() {
		 int[]arr= {10,20,30,40,50};
		 return arr;
	 }
	 
	 public static void PrintArray() {
		 ReturnArray obj=new ReturnArray ();
		 int[] arr1=obj.getArray();
		 
		 for(int num:arr1) {
			 System.out.println(num);
		 }
	 }
}

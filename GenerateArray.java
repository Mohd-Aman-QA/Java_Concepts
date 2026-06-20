package array;

public class GenerateArray {

	 public static void main(String[] args) {
		 printgeneratearray();
	 }
	 
	 public static int[] generatearray(int size) {
		 int[]arr=new int [size];
		 
		 for(int i=0; i<size; i++) {
			 arr[i]=i*19;
			 
		 }
		 return arr;
	 }
	 
	 public static void printgeneratearray() {
		 int[] arr1=generatearray(11);
		 
		 for(int num:arr1) {
			 System.out.println(num);
		 }
	 }
}

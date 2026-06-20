package array;

public class AnonymousArray {

	 public static void main(String[] args) {
		 AnonymousArray obj=new AnonymousArray();
		 obj.arrayprint(new int[] {1,2,3,4,5});
	 }
	 
	 public void arrayprint(int[] arr) {
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
	 }
}
